package com.rdi.evotersapp.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    @Enumerated(EnumType.ORDINAL)
    private State state;
    private String localGovernment;
    private String district;
    private final LocalDate registrationDate = LocalDate.now();
}
