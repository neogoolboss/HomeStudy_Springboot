package com.ohgiraffers.crud.menu.model.dao;


import com.ohgiraffers.crud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// configuration.addMapper(MenuMapper.class);
//getMapper(MenuMapper.class);
@Mapper
public interface MenuMapper {
    List<MenuDTO> findAllMenu();

    List<CategoryDTO> findAllCategory();

    void registNewMenu(MenuDTO newMenu);

    void modifyMenu(MenuDTO menuDTO);

    MenuDTO findByCode(int code);

    void delete(MenuDTO deleteMenu);

    List<MenuDTO> findAllMenuCode();
}
