package com.homestudy.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.homestudy")
public class ContextConfiguration {
}
