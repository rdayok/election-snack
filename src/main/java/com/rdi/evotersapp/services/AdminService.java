package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.AdminRegistrationRequest;
import com.rdi.evotersapp.dtos.requests.ElectionRequest;
import com.rdi.evotersapp.dtos.responses.AdminRegistrationResponse;
import com.rdi.evotersapp.dtos.responses.ElectionResponse;

public interface AdminService {
    public AdminRegistrationResponse register(AdminRegistrationRequest registrationRequest);

    public ElectionResponse createAnElection(ElectionRequest electionRequest);
}
