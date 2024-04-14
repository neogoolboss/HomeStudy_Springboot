package com.homestudy.section01.autowired.field;

import com.homestudy.section01.common.IdolDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.homestudy.section01");

        IdolService idolService = context.getBean("idolServiceField", IdolService.class);

        List<IdolDTO> idols = idolService.selectAllIdols();

        idols.forEach(System.out::println);

    }
}
