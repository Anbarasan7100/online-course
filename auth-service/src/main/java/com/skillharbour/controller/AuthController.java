package com.skillharbour.controller;

import com.skillharbour.dto.AuthResponse;
import com.skillharbour.dto.LoginRequest;
import com.skillharbour.dto.RequestRegister;
import com.skillharbour.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@Tag(name = "Auth", description = "Authentication endpoints")
public class AuthController {

    private final AuthService authService;

    @Operation(summary = "Register new User")
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@Valid @RequestBody RequestRegister requestRegister){
        return ResponseEntity.ok(authService.register(requestRegister));
    }

    @Operation(summary = "Login user with Credentials")
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

}
