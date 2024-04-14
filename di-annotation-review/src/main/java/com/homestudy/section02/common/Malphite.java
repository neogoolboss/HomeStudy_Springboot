package com.homestudy.section02.common;


import org.springframework.stereotype.Component;

@Component
public class Malphite implements Champion{
    @Override
    public void attack() {
        System.out.println("박을게...");
    }

    @Override
    public void provoke() {
        System.out.println("바위처럼 단단하게!!");
    }
}
