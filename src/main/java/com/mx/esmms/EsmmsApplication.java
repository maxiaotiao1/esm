package com.mx.esmms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.mx.esmms.modules.*.mapper")
public class EsmmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsmmsApplication.class, args);
    }

}
