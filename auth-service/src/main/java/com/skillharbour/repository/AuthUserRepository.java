package com.skillharbour.repository;

import com.skillharbour.entity.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser,Long> {
    boolean existsByEmail(String requestRegister);

    Optional<AuthUser> findByEmail(String email);
}
