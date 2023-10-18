package com.rdi.evotersapp.data.repositories;

import com.rdi.evotersapp.data.models.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Long> {
}

