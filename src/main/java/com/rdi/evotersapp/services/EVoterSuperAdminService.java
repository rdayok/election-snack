package com.rdi.evotersapp.services;

import com.rdi.evotersapp.data.models.SuperAdmin;
import com.rdi.evotersapp.data.repositories.SuperAdminRepository;
import com.rdi.evotersapp.dtos.requests.SuperAdminRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.RegisterSuperAdminResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EVoterSuperAdminService implements SuperAdminService {

    private final ModelMapper modelMapper;
    private final SuperAdminRepository superAdminRepository;
    @Override
    public RegisterSuperAdminResponse registerSuperAdmin(SuperAdminRegistrationRequest superAdminRegistrationRequest) {
        SuperAdmin superAdmin = modelMapper.map(superAdminRegistrationRequest, SuperAdmin.class);
        SuperAdmin savedSuperAdmin = superAdminRepository.save(superAdmin);
        RegisterSuperAdminResponse registerSuperAdminResponse = new RegisterSuperAdminResponse();
        registerSuperAdminResponse.setMessage("SUPER ADMIN REGISTERED SUCCESSFULLY");
        return registerSuperAdminResponse;
    }
}
