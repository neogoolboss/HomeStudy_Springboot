package com.ohgiraffers.crud.menu.model.service;

import com.ohgiraffers.crud.menu.model.dao.MenuMapper;
import com.ohgiraffers.crud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuService {

    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public List<MenuDTO> findAllMenu() {


        return menuMapper.findAllMenu();
    }

    public List<CategoryDTO> findAllCategory() {

        return menuMapper.findAllCategory();
    }

    @Transactional
    public void registNewMenu(MenuDTO newMenu) {

        menuMapper.registNewMenu(newMenu);

    }

    public void modifyMenu(MenuDTO menuDTO) {

        menuMapper.modifyMenu(menuDTO);

    }

    public MenuDTO findByCode(int code) {
        return menuMapper.findByCode(code);
    }


    public void delete(MenuDTO deleteMenu) {

        menuMapper.delete(deleteMenu);
    }


    public List<MenuDTO> findAllMenuCode() {

        return menuMapper.findAllMenuCode();
    }
}
