package com.rdi.evotersapp.services;

import com.rdi.evotersapp.data.repositories.StateChairmanRepository;
import com.rdi.evotersapp.dtos.requests.StateChairmanRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.StateChairmanRegistrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EVoterStateChairmanService implements StateChairmanService{

    private final StateChairmanRepository stateChairmanRepository;
    @Override
    public StateChairmanRegistrationResponse registerStateChairman(
            StateChairmanRegistrationRequest stateChairmanRegistrationRequest
    ) {

        return null;
    }
}
