package com.mx.esmms.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class FirstCycle {

  @TableId(type = IdType.AUTO)
  private Integer id;
  private Integer temperature;
  private Double  voltageLow;
  private Double  voltageHigh;
  private Double  currentDensity;
  private Integer chargeCapacity;
  private Integer dischargeCapacity;
  private Double coulombE;

  @TableField(fill = FieldFill.INSERT)
  private java.sql.Timestamp createTime;

  @TableField(fill = FieldFill.UPDATE)
  private java.sql.Timestamp updateTime;
}
