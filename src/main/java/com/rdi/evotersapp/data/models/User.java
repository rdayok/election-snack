package com.rdi.evotersapp.data.models;

import com.rdi.evotersapp.enums.Gender;
import com.rdi.evotersapp.enums.State;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "voters")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private State state;
    private String email;
    private String password;
    private LocalDateTime voterRegisteredDate;

    @PrePersist
    private void setVoterRegisteredDate() {
        this.voterRegisteredDate = LocalDateTime.now();
    }
}
