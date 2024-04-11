package com.homestudy.annotationconfig;

import com.homestudy.common.IdolGroupDAO;

import com.homestudy.common.IdolGroupDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationconfigApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        IdolGroupDAO idolGroupDAO = context.getBean("idolGroupDAO", IdolGroupDAO.class);

        System.out.println(idolGroupDAO.selectIdolGroup(6));
        System.out.println(idolGroupDAO.insertIdolGroup(new IdolGroupDTO(7, "BIGBANG", 5, "YG 엔터테인먼트", "거짓말", "VIP", "2006", "", 'N')));
        System.out.println(idolGroupDAO.selectIdolGroup(7));

    }
}
