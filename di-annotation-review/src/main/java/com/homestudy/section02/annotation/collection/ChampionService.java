package com.homestudy.section02.annotation.collection;


import com.homestudy.section02.common.Champion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("championServiceCollection")
public class ChampionService {

    private List<Champion> championList;

    public ChampionService(List<Champion> championList) {
        this.championList = championList;
    }

    public void championsAttack() {
        for(Champion champion : championList) {
            champion.attack();
        }
    }

    public void championsProvoke() {
        for(Champion champion : championList) {
            champion.provoke();
        }
    }

}
