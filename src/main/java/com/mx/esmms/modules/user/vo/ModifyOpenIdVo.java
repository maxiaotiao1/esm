package com.mx.esmms.modules.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "修改用户微信平台唯一标志VO")
@Data
public class ModifyOpenIdVo {

    @ApiModelProperty(value = "用户ID")
    Integer userId;

    @ApiModelProperty(value = "应用用户唯一标志")
    String openId;

    @ApiModelProperty(value = "平台用户唯一标志")
    String unionId;
}
