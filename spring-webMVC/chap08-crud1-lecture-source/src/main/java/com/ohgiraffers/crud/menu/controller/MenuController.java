package com.ohgiraffers.crud.menu.controller;

import com.ohgiraffers.crud.menu.model.dto.CategoryDTO;
import com.ohgiraffers.crud.menu.model.dto.MenuDTO;
import com.ohgiraffers.crud.menu.model.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/list")
    public String findMenuList(Model model) {

        List<MenuDTO> menuList = menuService.findAllMenu();

        for (MenuDTO menu : menuList) {
            System.out.println("menu = " + menu);
        }

        model.addAttribute("menuList", menuList);

        return "menu/list";
    }

    @GetMapping("/regist")
    public void registPage() {

    }

    @GetMapping(value = "category", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CategoryDTO> findCategoryList() {

        menuService.findAllCategory().forEach(System.out::println);

        return menuService.findAllCategory();

    }

    @PostMapping("/regist")
    public String registMenu(MenuDTO newMenu, RedirectAttributes redirectAttributes) {

        menuService.registNewMenu(newMenu);

        redirectAttributes.addFlashAttribute("successMessage", "신규 메뉴 등록 성공쓰");

        return "redirect:/menu/list";
    }

    @GetMapping("/modify")
    public void modifyPage() {
    }

    @PostMapping("modify")
    public String modifyMenu(MenuDTO menuDTO, RedirectAttributes redirectAttributes) {

        menuService.modifyMenu(menuDTO);

        redirectAttributes.addFlashAttribute("successMessage", "메뉴 수정 성공");

        return "redirect:/menu/list";
    }

    @GetMapping("/delete")
    public void deletePage() {
    }

    @PostMapping("delete")
    public String delete(MenuDTO deleteMenu, RedirectAttributes redirectAttributes) {
        menuService.delete(deleteMenu);

        redirectAttributes.addFlashAttribute("successMessage", "메뉴 삭제 성공");
        return "redirect:/menu/list";
    }

    @GetMapping(value = "code", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<MenuDTO> findMenuCodeList() {

        menuService.findAllMenuCode().forEach(System.out::println);

        return menuService.findAllMenuCode();

    }


//    @GetMapping("/{code}")
//    public String findByCode(@PathVariable("code") int code, Model model) {
//        MenuDTO menuDTO = menuService.findByCode(code);
//        model.addAttribute("menu", menuDTO);
//        System.out.println("menuDTO = " + menuDTO);
//
//        return "detail";
//    }

}
