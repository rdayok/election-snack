package com.rdi.evotersapp.services;

import com.rdi.evotersapp.data.models.User;
import com.rdi.evotersapp.data.repositories.UserRepository;
import com.rdi.evotersapp.dtos.requests.UserRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.UserRegistrationResponse;
import com.rdi.evotersapp.enums.Role;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class EVoterUserService implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserRegistrationResponse registerVoter(UserRegistrationRequest userRegistrationRequest) {
        User voter = modelMapper.map(userRegistrationRequest, User.class);
        User savedVoter = userRepository.save(voter);
        return modelMapper.map(savedVoter, UserRegistrationResponse.class);
    }



}
