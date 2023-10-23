package com.rdi.evotersapp.services;

import com.rdi.evotersapp.data.repositories.StateChairmanRepository;
import com.rdi.evotersapp.dtos.requests.StateChairmanRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.StateChairmanRegistrationResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EVoterStateChairmanService implements StateChairmanService{

    private final StateChairmanRepository stateChairmanRepository;
    private final ModelMapper modelMapper;
    @Override
    public StateChairmanRegistrationResponse registerStateChairman(
            StateChairmanRegistrationRequest stateChairmanRegistrationRequest
    ) {
        return userService.assignStateChairmanRole(stateChairmanRoleRequest);
    }
}
