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
  private Double  voltageLow;
  private Double  voltageHigh;
  private Double  currentDensity;
  private Integer temperature;
  private Integer cycleOne;
  private Integer cycleTwenty;
  private Integer cycleFifty;
  private Integer cycleSeventyFive;
  private Integer cycleOneHundred;
  private Integer cycleTwoHundred;

  @TableField(fill = FieldFill.INSERT)
  private java.sql.Timestamp createTime;

  @TableField(fill = FieldFill.UPDATE)
  private java.sql.Timestamp updateTime;

}
