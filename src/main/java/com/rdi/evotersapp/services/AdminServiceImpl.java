package com.rdi.evotersapp.services;

import com.rdi.evotersapp.data.models.Admin;
import com.rdi.evotersapp.data.repositories.AdminRepository;
import com.rdi.evotersapp.dtos.requests.AdminRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.AdminRegistrationResponse;
import org.springframework.stereotype.Service;


import static com.rdi.evotersapp.utils.Mapper.map;

@Service
public class AdminServiceImpl implements AdminService{

    private final AdminRepository adminRepository;


    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public AdminRegistrationResponse register(AdminRegistrationRequest registrationRequest) {
        Admin admin = map(registrationRequest);
        Admin savedAdmin = adminRepository.save(admin);
        return map(savedAdmin);
    }
}
