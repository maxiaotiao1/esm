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
  private Double  voltageLow;
  private Double  voltageHigh;
  private Integer temperature;
  private Integer iDotOneC;
  private Integer iDotTwoC;
  private Integer iDotFiveC;
  private Integer iOneC;
  private Integer iTwoC;
  private Integer iFourC;
  private Integer iFiveC;
  private Integer iTenC;

  @TableField(fill = FieldFill.INSERT)
  private java.sql.Timestamp createTime;

  @TableField(fill = FieldFill.UPDATE)
  private java.sql.Timestamp updateTime;


}
