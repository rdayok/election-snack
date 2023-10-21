package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.SuperAdminRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.RegisterSuperAdminResponse;
import com.rdi.evotersapp.exceptions.CanNotRegisterSuperAdminException;

public interface SuperAdminService {

    RegisterSuperAdminResponse registerSuperAdmin(SuperAdminRegistrationRequest superAdminRegistrationRequest) throws CanNotRegisterSuperAdminException;
}
