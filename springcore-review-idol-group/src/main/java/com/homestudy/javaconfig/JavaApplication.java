package com.homestudy.javaconfig;

import com.homestudy.common.IdolGroupDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        IdolGroupDTO idolGroup = context.getBean("idolGroup5", IdolGroupDTO.class);

        System.out.println("idolGroup = " + idolGroup);

    }

}
