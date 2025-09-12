package com.skillharbour.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Data
public class RequestRegister {

    @NotBlank(message = "Enter your email address")
    @Email(message = "Enter valid email")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, message = "Password should contain at least 8 Characters ")
    private String password;

}
