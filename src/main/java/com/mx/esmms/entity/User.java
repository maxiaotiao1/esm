package com.mx.esmms.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class User {
  private Integer id;
  private String userName;
  private String userPassword;
  private String phone;

  @TableField(fill = FieldFill.INSERT)
  private java.sql.Timestamp createTime;

  @TableField(fill = FieldFill.UPDATE)
  private java.sql.Timestamp updateTime;
}
