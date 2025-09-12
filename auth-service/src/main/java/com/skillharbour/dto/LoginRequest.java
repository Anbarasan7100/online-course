package com.skillharbour.dto;

import lombok.Data;

import jakarta.validation.constraints.*;

@Data
public class LoginRequest {

    @NotBlank(message = "Enter your email address")
    @Email(message = "Enter valid email")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, message = "Password should contain at least 8 Characters ")
    private String password;
}
