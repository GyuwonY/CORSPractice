package com.sparta.corspractice.userservice;

import com.sparta.corspractice.model.User;
import com.sparta.corspractice.dto.UserRequestDto;
import com.sparta.corspractice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signup(UserRequestDto userRequestDto){
        userRequestDto.setPassword(passwordEncoder.encode(userRequestDto.getPassword()));
        User user = new User(userRequestDto);
        return userRepository.save(user);
    }
}
