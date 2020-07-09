package com.mx.esmms.modules.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "创建用户VO")
@Data
public class CreateUserVo {

    @ApiModelProperty("手机号/账号")
    String mobile;

    @ApiModelProperty("密码")
    String password;

    @ApiModelProperty("性别")
    Integer gender;

    @ApiModelProperty("年龄")
    Integer age;

    @ApiModelProperty("身高")
    Integer height;

    @ApiModelProperty("体重")
    Integer weight;

    @ApiModelProperty("国家ID")
    Integer countryId;

    @ApiModelProperty("省份ID")
    Integer provinceId;

    @ApiModelProperty("城市ID")
    Integer cityId;

    @ApiModelProperty("用户角色")
    Integer userRole;
}
