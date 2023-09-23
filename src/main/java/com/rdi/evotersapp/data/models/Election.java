package com.rdi.evotersapp.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Enumerated(EnumType.STRING)
    private TypeOfElection election;
    @ManyToMany
    @JoinColumn(name = "partyId")
    private List<Party> registeredParties;
    private Boolean isActive;
    @CreatedDate
    private final LocalDateTime electionDate = LocalDateTime.now();
}
