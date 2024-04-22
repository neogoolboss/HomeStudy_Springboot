package com.homestudy.menucrud.menu.model.repository;

import com.homestudy.menucrud.menu.model.dto.MenuDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MenuRepository {

    private final SqlSessionTemplate sqlSessionTemplate;

    public MenuRepository(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public MenuDTO findByCode(int code) {
        return sqlSessionTemplate.selectOne("com.homestudy.menucrud.menu.model.dao.MenuMapper.findByCode", code);
    }

    public void update2(MenuDTO menuDTO) {

        sqlSessionTemplate.update("com.homestudy.menucrud.menu.model.dao.MenuMapper.update2", menuDTO);

    }
}
