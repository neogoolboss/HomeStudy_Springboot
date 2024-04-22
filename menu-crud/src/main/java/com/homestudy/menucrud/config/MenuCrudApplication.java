package com.homestudy.menucrud.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.homestudy.menucrud")
@MapperScan(basePackages = "com.homestudy.menucrud", annotationClass = Mapper.class)
public class MenuCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuCrudApplication.class, args);
    }

}
