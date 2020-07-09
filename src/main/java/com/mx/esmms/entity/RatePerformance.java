package com.mx.esmms.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class RatePerformance {

  @TableId(type = IdType.AUTO)
  private Integer id;
  private Integer voltageLow;
  private Integer voltageHigh;
  private Integer temperature;
  private Integer i0_1C;
  private Integer i0_2C;
  private Integer i0_5C;
  private Integer i1C;
  private Integer i2C;
  private Integer i4C;
  private Integer i5C;
  private Integer i10C;

  @TableField(fill = FieldFill.INSERT)
  private java.sql.Timestamp createTime;

  @TableField(fill = FieldFill.UPDATE)
  private java.sql.Timestamp updateTime;


}
