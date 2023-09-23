package com.rdi.evotersapp.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CANDIDATE")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    @JoinColumn(name = "candidateVoterId")
    private Voter voterId;
    @OneToOne
    @JoinColumn(name = "electionId")
    private Election electionId;
    @OneToOne
    @JoinColumn(name = "partyId")
    private Party partyId;
    @CreatedDate
    private LocalDateTime registrationDate;
}
