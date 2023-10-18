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
@Table(name = "VOTE")
public class Vote {
    @Id
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "voterId")
    private User voterId;
    @ManyToOne
    @JoinColumn(name = "electionId")
    private Election electionId;
    private LocalDate dateOfVote;
}
