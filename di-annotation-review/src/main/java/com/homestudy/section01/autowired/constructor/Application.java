package com.homestudy.section01.autowired.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.homestudy.section01");

        IdolService idolService = context.getBean("idolServiceConstructor", IdolService.class);

        idolService.selectAllIdols().forEach(System.out::println);
        System.out.println("-----------------------------------------");

        System.out.println(idolService.searchIdolByGroupCode(3));

    }

}
