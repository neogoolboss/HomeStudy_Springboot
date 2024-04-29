package com.homestudy.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")

public class ResoleverController {

    @GetMapping("string")
    public String stringRetuning() {
        System.out.println("/string으로 이동");
        return "result";
    }

}
