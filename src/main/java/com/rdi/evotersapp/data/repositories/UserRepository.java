package com.rdi.evotersapp.data.repositories;

import com.rdi.evotersapp.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
