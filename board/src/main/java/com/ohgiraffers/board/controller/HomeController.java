package com.ohgiraffers.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 시작페이지를 받아주는 메서드
    @GetMapping("/")
    public String index() {
        System.out.println("HomeController.index");
        return "index"; // index.html을 띄우겠다!
    }
}
