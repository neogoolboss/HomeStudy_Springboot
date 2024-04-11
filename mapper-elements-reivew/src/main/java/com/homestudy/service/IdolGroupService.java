package com.homestudy.service;

import com.homestudy.common.IdolGroupDTO;
import com.homestudy.xmlmapper.IdolGroupMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.homestudy.common.Template.getSqlSession;

public class IdolGroupService {

    private IdolGroupMapper mapper;

    public void selectResultMap() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(IdolGroupMapper.class);

        List<IdolGroupDTO> idolGroupList = mapper.selectResultMap();

        for(IdolGroupDTO idolGroup : idolGroupList) {
            System.out.println(idolGroup);
        }

        sqlSession.close();

    }
}
