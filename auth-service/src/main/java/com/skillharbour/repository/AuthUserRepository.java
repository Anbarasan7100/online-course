package com.skillharbour.repository;

import com.skillharbour.entity.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public interface AuthUserRepository extends JpaRepository<AuthUser,Long> {
    boolean existsByEmail(@NotBlank(message = "Enter your email address") @Email(message = "Enter valid email") String requestRegister);
}
