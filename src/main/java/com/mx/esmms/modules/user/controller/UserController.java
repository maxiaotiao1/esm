package com.mx.esmms.modules.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.DynamicParameter;
import com.github.xiaoymin.knife4j.annotations.DynamicResponseParameters;
import com.mx.esmms.common.r.R;
import com.mx.esmms.common.utils.JwtUtils;
import com.mx.esmms.entity.User;
import com.mx.esmms.modules.user.service.UserService;
import com.mx.esmms.modules.user.vo.VerifyUserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@Api(tags = {"用户操作接口"})
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "登陆")
    @PostMapping("/login")
    @ApiOperationSupport(
            responses = @DynamicResponseParameters(properties = {
                    @DynamicParameter(value = "请求返回状态码", name = "code", dataTypeClass = Integer.class),
                    @DynamicParameter(value = "信息提示", name = "msg", dataTypeClass = String.class)
            })
    )
    public R Login(@RequestBody VerifyUserVo verifyUserVo) {

        if (verifyUserVo.getUserPassword() == null || verifyUserVo.getUserName() == null){
            return R.error("账号或密码为空");
        }

        User inputUser = new User();
        BeanUtils.copyProperties(verifyUserVo, inputUser);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("user_name",inputUser.getUserName());
        User user = userService.getOne(queryWrapper);
        if ( user == null) {
            return R.error("账号不存在");
        } else {
            if ((user.getUserPassword()).equals(inputUser.getUserPassword())){
                //使用JWT生成token字符串
                String token = JwtUtils.getJwtToken(user.getId(), user.getUserName());
                return R.ok("登陆成功").put("token",token);
            }else {
                return R.error("密码错误");
            }
        }
    }


    @ApiOperation(value = "根据token获取登录信息")
    @GetMapping("/getLoginInfo")
    public R getLoginInfo(HttpServletRequest request){
            Integer memberId = JwtUtils.getMemberIdByJwtToken(request);
            User loginInfoVo = userService.getOne(
                        new QueryWrapper<User>().eq("id",memberId)
                    );
            if (loginInfoVo == null){
                return R.error("获取用户信息失败");
            }else {
                return R.ok().put("userName", loginInfoVo.getUserName());
            }
    }


}
