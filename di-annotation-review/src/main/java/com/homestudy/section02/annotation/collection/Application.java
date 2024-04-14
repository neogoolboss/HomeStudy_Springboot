package com.homestudy.section02.annotation.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.homestudy.section02");

        ChampionService championService = context.getBean("championServiceCollection", ChampionService.class);

        championService.championsAttack();
        System.out.println("------------------------------");
        championService.championsProvoke();

    }
}
