package com.skillharbour.serviceImpl;

import com.skillharbour.dto.AuthResponse;
import com.skillharbour.dto.LoginRequest;
import com.skillharbour.dto.RequestRegister;
import com.skillharbour.entity.AuthUser;
import com.skillharbour.enums.Role;
import com.skillharbour.repository.AuthUserRepository;
import com.skillharbour.security.JwtUtil;
import com.skillharbour.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthUserRepository authUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @Override
    public AuthResponse register(RequestRegister requestRegister) {
        if(authUserRepository.existsByEmail(requestRegister.getEmail())){
            throw new RuntimeException("Email already exists");
        }

        AuthUser user = AuthUser.builder()
                .email(requestRegister.getEmail())
                .password(passwordEncoder.encode(requestRegister.getPassword()))
                .role(Role.STUDENT)
                .build();

        authUserRepository.save(user);

        String token = jwtUtil.generateToken(user.getEmail(),user.getRole().name());

        return new AuthResponse(token);
    }

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }
}
