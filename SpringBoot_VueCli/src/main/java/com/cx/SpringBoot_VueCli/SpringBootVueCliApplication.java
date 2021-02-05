package com.cx.SpringBoot_VueCli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cx.SpringBoot_VueCli.dao")
public class SpringBootVueCliApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootVueCliApplication.class, args);
    }

}
