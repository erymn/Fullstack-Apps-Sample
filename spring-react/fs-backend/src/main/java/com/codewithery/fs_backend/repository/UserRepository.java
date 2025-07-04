package com.codewithery.fs_backend.repository;

import com.codewithery.fs_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
