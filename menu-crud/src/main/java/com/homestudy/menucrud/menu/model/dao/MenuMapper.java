package com.homestudy.menucrud.menu.model.dao;

import com.homestudy.menucrud.menu.model.dto.CategoryDTO;
import com.homestudy.menucrud.menu.model.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<MenuDTO> findAllMenu();

    List<CategoryDTO> findAllCategory();

    void registNewMenu(MenuDTO newMenu);

    void delete(int code);

    MenuDTO findByCode(int code);

    void update(MenuDTO menu);

    List<MenuDTO> findAllMenuCode();
}
