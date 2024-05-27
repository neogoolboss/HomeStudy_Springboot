package com.homestudy.jwtsecurity.user.controller;

import com.homestudy.jwtsecurity.user.dto.LoginUserDTO;
import com.homestudy.jwtsecurity.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signUp(@RequestBody LoginUserDTO user) {
        return userService.signUp(user);
    }
}
