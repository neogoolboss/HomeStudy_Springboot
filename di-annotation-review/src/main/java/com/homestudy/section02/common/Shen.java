package com.homestudy.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Shen implements Champion{
    @Override
    public void attack() {
        System.out.println("도발!");
    }

    @Override
    public void provoke() {
        System.out.println("너는 이미 죽어있다. 단지 아직 깨닫지 못했을 뿐");
    }
}
