package com.homestudy.section02.annotation.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.homestudy.section02");

        ChampionService championService = context.getBean("championServicePrimary", ChampionService.class);

        championService.championAttack();
        championService.championProvoke();

    }
}
