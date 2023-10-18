package com.rdi.evotersapp.dtos.requests;

import com.rdi.evotersapp.enums.State;
import com.rdi.evotersapp.enums.Gender;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private State state;
    private LocalDate dateOfBirth;
    private Gender gender;
}
