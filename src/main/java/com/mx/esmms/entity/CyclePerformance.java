package com.mx.esmms.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.models.auth.In;
import lombok.Data;

@Data
public class CyclePerformance {

  @TableId(type = IdType.AUTO)
  private Integer id;
  private Integer voltageLow;
  private Integer voltageHigh;
  private Integer currentDenstity;
  private Integer temperature;
  private Integer cycle1;
  private Integer cycle20;
  private Integer cycle50;
  private Integer cycle75;
  private Integer cycle100;
  private Integer cycle200;

  @TableField(fill = FieldFill.INSERT)
  private java.sql.Timestamp createTime;

  @TableField(fill = FieldFill.UPDATE)
  private java.sql.Timestamp updateTime;

}
