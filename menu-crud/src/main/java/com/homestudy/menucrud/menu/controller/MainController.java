package com.homestudy.menucrud.menu.controller;

import com.homestudy.menucrud.menu.model.dto.CategoryDTO;
import com.homestudy.menucrud.menu.model.dto.MenuDTO;
import com.homestudy.menucrud.menu.model.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MainController {

    private final MenuService menuService;

    public MainController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/list")
    public String findMenuList(Model model) {

        List<MenuDTO> menuList = menuService.findAllMenu();

        for (MenuDTO menus : menuList) {
            System.out.println("menus = " + menus);
        }

        model.addAttribute("menuList", menuList);

        return "menu/list";
    }

    @GetMapping("/regist")
    public void registPage() {}

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

//    @GetMapping("/{code}")
//    public String findByCode(@PathVariable("code") int code, Model model) {
//        MenuDTO menuDTO = menuService.findByCode(code);
//        model.addAttribute("menu", menuDTO);
//        System.out.println("menuDTO = " + menuDTO);
//
//        return "/menu/list";
//    }

//    @GetMapping("/update/{code}")
//    public String update(@PathVariable("code") int code, Model model) {
//        MenuDTO menu = menuService.findByCode(code);
//        model.addAttribute("menu", menu);
//
//        return "menu/update";
//    }
    @GetMapping("/update")
    public void updatePage() {
    }

    @PostMapping("/update")
    public String update(MenuDTO menu, Model model){
        menuService.update(menu);
        MenuDTO dto = menuService.findByCode(menu.getCode());
        model.addAttribute("menu", dto);
        return "menu/update";
    }

    @GetMapping(value = "code", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<MenuDTO> findMenuCode() {
        menuService.findAllMenuCode().forEach(System.out::println);

        return menuService.findAllMenuCode();
    }


    @GetMapping("/delete/{code}")
    public String delete(@PathVariable("code") int code) {
        menuService.delete(code);

        return "redirect:/menu/list";
    }

    @GetMapping("/update/{code}")
    public String update2(@PathVariable("code") int code, Model model) {
        MenuDTO menuDTO = menuService.findByCode2(code);
        model.addAttribute("menu", menuDTO);

        return "menu/update";
    }

    @PostMapping("/update/{code}")
    public String update2(MenuDTO menuDTO, Model model) {
        menuService.update2(menuDTO);
        MenuDTO dto = menuService.findByCode2(menuDTO.getCode());
        model.addAttribute("menu", dto);

        return "redirect:/menu/list";
    }


}
