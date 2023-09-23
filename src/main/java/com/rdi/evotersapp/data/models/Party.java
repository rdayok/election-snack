package com.rdi.evotersapp.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Party {
    private String partyName;
    @Id
    private String partyAcronym;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Candidate> candidates;
    private final LocalDate partyRegistrationDate = LocalDate.now();
}
