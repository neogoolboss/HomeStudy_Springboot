package com.homestudy.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IdolGroupDAO {

    private final Map<Integer, IdolGroupDTO> idolMap;

    public IdolGroupDAO() {
        idolMap = new HashMap<>();

        idolMap.put(6, new IdolGroupDTO(6, "동방신기", 2, "SM엔터테인먼트", "주문", "카시오페아", "2003", "", 'N'));
    }

    public IdolGroupDTO selectIdolGroup(int groupCode) {

        return idolMap.get(groupCode);

    }

    public boolean insertIdolGroup(IdolGroupDTO newIdolGroup) {

        int before = idolMap.size();

        idolMap.put(newIdolGroup.getGroupCode(), newIdolGroup);

        int after = idolMap.size();

        return after > before ? true : false;

    }

}
