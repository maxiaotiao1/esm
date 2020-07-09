package com.mx.esmms.modules.user.respones;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RUserInfo {
    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("用户性别")
    private Integer gender;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("身高")
    private Integer height;

    @ApiModelProperty("体重")
    private Integer weight;

    @ApiModelProperty("国家ID")
    private Integer countryId;

    @ApiModelProperty("省份ID")
    private Integer provinceId;

    @ApiModelProperty("城市ID")
    private Integer cityId;

    @ApiModelProperty("用户头像URL")
    private String headimgurl;
}
