package com.mx.esmms.modules.oss.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.DynamicParameter;
import com.github.xiaoymin.knife4j.annotations.DynamicResponseParameters;
import com.mx.esmms.common.r.R;
import com.mx.esmms.modules.oss.service.OssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = "阿里云存储接口")
@RestController
@CrossOrigin
public class OssController {

    @Autowired
    private OssService ossService;
    //上传头像的方法

    @ApiOperation(value = "通过本地文件上传图片返回oss地址")
    @PostMapping("/api/oss/uploadimg/byfile")
    @ApiOperationSupport(
            responses = @DynamicResponseParameters(properties = {
                    @DynamicParameter(value = "请求返回状态码", name = "code"),
                    @DynamicParameter(value = "信息提示", name = "msg"),
                    @DynamicParameter(value = "图片的Oss地址", name = "url")
            })
    )
    public R uploadOssFile(@ApiParam("本地文件") @RequestBody MultipartFile file) {
        //获取上传文件  MultipartFile
        //返回上传到oss的路径
        String url = ossService.uploadFileAvatar(file);
        return R.ok().put("url", url);
    }


    @ApiOperation(value = "通过网络地址上传图片返回oss地址")
    @PostMapping("/api/oss/uploadimg/byurl")
    @ApiOperationSupport(
            responses = @DynamicResponseParameters(properties = {
                    @DynamicParameter(value = "请求返回状态码", name = "code"),
                    @DynamicParameter(value = "信息提示", name = "msg"),
                    @DynamicParameter(value = "图片的Oss地址", name = "url")
            })
    )
    public R uploadOssFileUrl(@ApiParam("在线图片地址") @RequestBody String url) {
        String address = ossService.uploadFileAvatar(url);
        return R.ok().put("url", address);
    }

}
