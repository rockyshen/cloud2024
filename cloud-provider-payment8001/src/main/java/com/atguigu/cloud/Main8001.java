package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper")   //mybatis提供的注解，将Mapper接口扫描进ioc容器
public class Main8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main8001.class,args);
        System.out.println("SpringBoot启动了！");
    }
}