package com.ym;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@MapperScan(basePackages = "com.ym.dao")
@SpringBootApplication
public class UserproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserproviderApplication.class, args);
    }

}
