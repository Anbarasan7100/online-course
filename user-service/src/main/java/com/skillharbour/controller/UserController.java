package com.skillharbour.controller;

import com.skillharbour.dto.CreateUserRequest;
import com.skillharbour.dto.UserDto;
import com.skillharbour.security.SecurityUtil;
import com.skillharbour.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

  //  private final UserService userService;

//    public ResponseEntity<UserDto> createUser(@Valid @RequestBody CreateUserRequest createUserRequest){
//        String authUserId = SecurityUtil
//    }

}
