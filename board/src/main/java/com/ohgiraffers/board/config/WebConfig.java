package com.ohgiraffers.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private String resourcePath = "/upload/**"; // view에서 사용할 경로

    private String savePath = "file:///D:/HomeStudy/intellij_spring_file/spring_upload_files/";

    public void addResourceHandler(ResourceHandlerRegistration registry) {
        registry.addResourceLocations(resourcePath)
                .addResourceLocations(savePath);
    }

}
