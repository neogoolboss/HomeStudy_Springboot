package com.homestudy.service;

import com.homestudy.common.HitsongAndIdolGroupDTO;
import com.homestudy.common.IdolGroupAndHitsongDTO;
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

    public void selectResultMapConstructor() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(IdolGroupMapper.class);

        List<IdolGroupDTO> idolGroupList = mapper.selectResultMapConstructor();

//        for(IdolGroupDTO idolGroup : idolGroupList) {
//            System.out.println(idolGroup);
//        }

        idolGroupList.forEach(System.out::println);

        sqlSession.close();

    }

    public void selectResultMapAssociation() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(IdolGroupMapper.class);

        List<IdolGroupAndHitsongDTO> idolGroupList = mapper.selectResultMapAssociation();

        idolGroupList.forEach(System.out::println);

        sqlSession.close();

    }

    public void selectResultMapCollection() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(IdolGroupMapper.class);

        List<HitsongAndIdolGroupDTO> idolList = mapper.selectResultMapCollection();

        idolList.forEach(System.out::println);

        sqlSession.close();

    }

    public boolean insertIdol(IdolGroupDTO idol) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(IdolGroupMapper.class);

        int result = mapper.insertIdol(idol);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
