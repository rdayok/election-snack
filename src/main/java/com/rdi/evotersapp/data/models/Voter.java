package com.rdi.evotersapp.data.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "VOTER")
@AllArgsConstructor
@NoArgsConstructor
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    @Enumerated(EnumType.STRING)
    private State state;
    private String localGovernment;
    private String district;
    private String email;
    private String password;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "voteId")
    public List<Vote> votes;
    @CreatedDate
    private LocalDateTime voterRegistrationDate;
}
