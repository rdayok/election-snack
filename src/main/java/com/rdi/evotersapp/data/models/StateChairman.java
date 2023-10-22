package com.rdi.evotersapp.data.models;

import com.rdi.evotersapp.enums.State;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "state_chairmen")
@Setter
@Getter
public class StateChairman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;
    private State state;
    private LocalDateTime chairmanRegistrationDate;

    @PrePersist
    private void setChairmanRegistrationDate() {
        this.chairmanRegistrationDate=LocalDateTime.now();
    }
}
