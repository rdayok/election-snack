package com.rdi.evotersapp.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vote {
    @Id
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "voterId")
    private Voter voterId;
    @ManyToOne
    @JoinColumn(name = "electionId")
    private Election electionId;
    private final LocalDate dateOfVote = LocalDate.now();
}
