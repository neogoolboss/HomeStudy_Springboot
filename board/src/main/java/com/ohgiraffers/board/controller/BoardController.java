package com.ohgiraffers.board.controller;

import com.ohgiraffers.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService; // 생성자 주입방식
}
