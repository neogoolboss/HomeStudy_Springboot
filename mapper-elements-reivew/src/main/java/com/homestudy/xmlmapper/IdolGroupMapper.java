package com.homestudy.xmlmapper;

import com.homestudy.common.HitsongAndIdolGroupDTO;
import com.homestudy.common.IdolGroupAndHitsongDTO;
import com.homestudy.common.IdolGroupDTO;

import java.util.List;

public interface IdolGroupMapper {
    List<IdolGroupDTO> selectResultMap();

    List<IdolGroupDTO> selectResultMapConstructor();

    List<IdolGroupAndHitsongDTO> selectResultMapAssociation();

    List<HitsongAndIdolGroupDTO> selectResultMapCollection();

    int insertIdol(IdolGroupDTO idol);
}
