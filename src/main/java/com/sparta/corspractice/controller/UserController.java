package com.sparta.corspractice.controller;

import com.sparta.corspractice.model.User;
import com.sparta.corspractice.dto.UserRequestDto;
import com.sparta.corspractice.userservice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user/signup")
    public User signup(@RequestBody UserRequestDto userRequestDto){
        return userService.signup(userRequestDto);
    }

    @PostMapping("/user/userinfo")
    public void getUserInfo(@RequestBody UserRequestDto userRequestDto) {

    }
}
