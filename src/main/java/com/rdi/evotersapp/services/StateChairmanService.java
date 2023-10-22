package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.StateChairmanRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.StateChairmanRegistrationResponse;

public interface StateChairmanService {
    StateChairmanRegistrationResponse registerStateChairman(
            StateChairmanRegistrationRequest stateChairmanRegistrationRequest
    );
}
