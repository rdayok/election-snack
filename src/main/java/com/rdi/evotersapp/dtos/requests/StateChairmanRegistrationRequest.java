package com.rdi.evotersapp.dtos.requests;

import com.rdi.evotersapp.enums.Role;
import com.rdi.evotersapp.enums.State;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StateChairmanRegistrationRequest {
    private Long voterId;
    private State state;
    private Role role;

}
