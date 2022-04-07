package com.sparta.corspractice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequestDto {
    private String username;
    private String nickname;
    private String password;
}
