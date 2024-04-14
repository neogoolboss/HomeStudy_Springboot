package com.homestudy.section01.common;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class IdolDAOimpl implements IdolDAO{

    private final Map<Integer, IdolDTO> idolList;

    public IdolDAOimpl() {
        idolList = new HashMap<>();
        idolList.put(1, new IdolDTO(1, "쿨", "쿨 컴퍼니", "운명", 1994));
        idolList.put(2, new IdolDTO(2, "룰라", "", "날개잃은 천사", 1994));
        idolList.put(3, new IdolDTO(3, "H.O.T.", "SM엔터테인먼트", "캔디", 1996));
        idolList.put(4, new IdolDTO(4, "핑클", "DSP미디어", "영원한 사랑", 1998));
        idolList.put(5, new IdolDTO(5, "코요태", "KYT엔터테인먼트", "순정", 1998));
    }

    @Override
    public List<IdolDTO> selectIdolList() {
        return new ArrayList<>(idolList.values());
    }

    @Override
    public IdolDTO selectOneIdol(int groupCode) {
        return idolList.get(groupCode);
    }
}
