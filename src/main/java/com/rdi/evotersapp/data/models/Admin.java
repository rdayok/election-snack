package com.rdi.evotersapp.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ADMIN")
public class Admin {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    @NaturalId
    private String emil;
    private String password;
    @CreatedDate
    private LocalDateTime adminRegistrationDate;
}
