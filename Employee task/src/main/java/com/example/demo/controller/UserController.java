package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.AuthorityService;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;
    private AuthorityService authorityService;

    public UserController(UserService userService, AuthorityService authorityService) {
        this.userService = userService;
        this.authorityService = authorityService;
    }

    @PostMapping("/register")
    public String saveUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto.getUsers());
        authorityService.saveUser(userDto.getAuthority());
        return "Registered";
    }
}
