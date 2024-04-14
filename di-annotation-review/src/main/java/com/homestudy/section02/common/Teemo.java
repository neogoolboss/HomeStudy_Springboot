package com.homestudy.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Teemo implements Champion{
    @Override
    public void attack() {
        System.out.println("푝푝 실명! 푝푝");
    }

    @Override
    public void provoke() {
        System.out.println("하하핫 하하핫 하하핫 하하핫 하하핫");
    }
}
