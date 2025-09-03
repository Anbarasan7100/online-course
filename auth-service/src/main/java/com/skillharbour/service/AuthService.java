package com.skillharbour.service;

import com.skillharbour.dto.AuthResponse;
import com.skillharbour.dto.LoginRequest;
import com.skillharbour.dto.RequestRegister;

import javax.validation.Valid;

public interface AuthService {
    AuthResponse register(@Valid RequestRegister requestRegister);

    AuthResponse login(@Valid LoginRequest loginRequest);
}
