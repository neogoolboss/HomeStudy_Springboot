package com.homestudy.section02.annotation.primary;

import com.homestudy.section02.common.Champion;
import org.springframework.stereotype.Service;

@Service("championServicePrimary")
public class ChampionService {

    private Champion champion;

    public ChampionService(Champion champion) {
        this.champion = champion;
    }

    public void championAttack() {
        champion.attack();
    }

    public void championProvoke() {
        champion.provoke();
    }
}
