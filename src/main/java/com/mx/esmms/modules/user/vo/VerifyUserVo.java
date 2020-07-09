package com.mx.esmms.modules.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "验证用户账号密码VO")
@Data
public class VerifyUserVo {

    @ApiModelProperty("账号")
    String userName;

    @ApiModelProperty("密码")
    String userPassword;

}
