package com.rdi.evotersapp.data.models;

import com.rdi.evotersapp.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class SuperAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

    @PrePersist
    public void setRole() {
        this.role= Role.SUPER_ADMIN;
    }
}
