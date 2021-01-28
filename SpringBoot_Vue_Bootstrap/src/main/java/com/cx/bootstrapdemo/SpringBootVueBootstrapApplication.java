package com.cx.bootstrapdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cx.bootstrapdemo.dao")
public class SpringBootVueBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVueBootstrapApplication.class, args);
    }

}
