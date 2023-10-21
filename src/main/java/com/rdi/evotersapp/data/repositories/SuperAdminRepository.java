package com.rdi.evotersapp.data.repositories;

import com.rdi.evotersapp.data.models.SuperAdmin;
import com.rdi.evotersapp.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Long> {
    SuperAdmin findByRole(Role role);
}

