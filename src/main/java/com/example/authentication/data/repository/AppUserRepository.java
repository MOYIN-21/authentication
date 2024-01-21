package com.example.authentication.data.repository;

import com.example.authentication.data.models.AppUser;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
