package com.rdi.evotersapp.dtos.requests;

import com.rdi.evotersapp.data.models.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VoterRegistrationRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private State state;
    private String localGovernment;
    private String district;
}
