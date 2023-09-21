package com.rdi.evotersapp.data.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Party {
    private String partyName;
    @Id
    private String partyAcronym;
    private LocalDate partyRegistrationDate = LocalDate.now();
}
