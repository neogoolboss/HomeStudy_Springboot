package com.homestudy.xmlconfig;

import com.homestudy.common.IdolGroupDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlApplication {


    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("com/homestudy/xmlconfig/spring-context.xml");

        IdolGroupDTO idolGroup = context.getBean("idolGroup", IdolGroupDTO.class);
        System.out.println("idolGroup = " + idolGroup);

        IdolGroupDTO idolGroup2 = context.getBean("idolGroup2", IdolGroupDTO.class);
        System.out.println("idolGroup2 = " + idolGroup2);

        IdolGroupDTO idolGroup3 = context.getBean("idolGroup3", IdolGroupDTO.class);
        System.out.println("idolGroup3 = " + idolGroup3);

        IdolGroupDTO idolGroup4 = context.getBean("idolGroup4", IdolGroupDTO.class);
        System.out.println("idolGroup4 = " + idolGroup4);

    }


}
