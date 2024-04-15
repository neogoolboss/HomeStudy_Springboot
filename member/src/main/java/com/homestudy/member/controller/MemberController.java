package com.homestudy.member.controller;

import com.homestudy.member.dto.MemberDTO;
import com.homestudy.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class MemberController {
    // 생성자 주입
    private final MemberService memberService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }

    // 각각 파라미터를 Service 클래스 -> Repository 클래스 -> Database
    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
//        MemberService memberService = new MemberService();
//        memberService.save();  <-- 기존 자바방식은 이렇게 호출했지만 스프링에선 사용 하지 않음.
        memberService.save(memberDTO);
        return "index";
    }

}
