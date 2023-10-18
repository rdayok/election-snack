package com.rdi.evotersapp.services;


import com.rdi.evotersapp.data.models.User;
import com.rdi.evotersapp.dtos.requests.UserRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.UserRegistrationResponse;
import com.rdi.evotersapp.enums.Role;

public interface UserService {

    public UserRegistrationResponse registerVoter(UserRegistrationRequest userRegistrationRequest);

}
