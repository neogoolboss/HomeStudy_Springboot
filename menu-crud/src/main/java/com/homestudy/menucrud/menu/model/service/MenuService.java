package com.homestudy.menucrud.menu.model.service;

import com.homestudy.menucrud.menu.model.dao.MenuMapper;
import com.homestudy.menucrud.menu.model.dto.CategoryDTO;
import com.homestudy.menucrud.menu.model.dto.MenuDTO;
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

    @Transactional
    public void registNewMenu(MenuDTO newMenu) {

        menuMapper.registNewMenu(newMenu);

    }


    public List<CategoryDTO> findAllCategory() {

        return menuMapper.findAllCategory();

    }

    public void delete(int code) {
        menuMapper.delete(code);
    }


    public MenuDTO findByCode(int code) {
        return menuMapper.findByCode(code);
    }

    public void update(MenuDTO menu) {
        menuMapper.update(menu);
    }

    public List<MenuDTO> findAllMenuCode() {

        return menuMapper.findAllMenuCode();
    }
}
