package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.SuperAdminRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.RegisterSuperAdminResponse;

public interface SuperAdminService {

    RegisterSuperAdminResponse registerSuperAdmin(SuperAdminRegistrationRequest superAdminRegistrationRequest);
}
