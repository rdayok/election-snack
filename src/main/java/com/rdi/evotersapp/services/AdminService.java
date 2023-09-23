package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.AdminRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.AdminRegistrationResponse;

public interface AdminService {
    public AdminRegistrationResponse register(AdminRegistrationRequest registrationRequest);
}
