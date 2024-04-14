package com.homestudy.section02.annotation.qualifier;

import com.homestudy.section02.common.Champion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("championServiceQualifier")
public class ChampionService {


//    @Autowired
//    @Qualifier("shen")
    private Champion champion;

//    @Autowired
    public ChampionService(@Qualifier("malphite") Champion champion) {
        this.champion = champion;
    }

    public void championAttack() {
        champion.attack();
    }

    public void championProvoke() {
        champion.provoke();
    }
}
