package com.rdi.evotersapp.dtos.responses;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rdi.evotersapp.enums.State;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonPropertyOrder({"id", "firstName", "lastName", "email", "dateOfBirth", "gender", "state", "localGovernment", "district", "voterRegistratinDate"})
public class UserRegistrationResponse {
    private Long Id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private State state;
    private LocalDateTime voterRegistrationDate;
}
