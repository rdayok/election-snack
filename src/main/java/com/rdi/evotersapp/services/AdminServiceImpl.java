package com.rdi.evotersapp.services;

import com.rdi.evotersapp.data.models.Admin;
import com.rdi.evotersapp.data.models.Election;
import com.rdi.evotersapp.data.repositories.AdminRepository;
import com.rdi.evotersapp.data.repositories.ElectionRepository;
import com.rdi.evotersapp.dtos.requests.AdminRegistrationRequest;
import com.rdi.evotersapp.dtos.requests.ElectionRequest;
import com.rdi.evotersapp.dtos.responses.AdminRegistrationResponse;
import com.rdi.evotersapp.dtos.responses.ElectionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import static com.rdi.evotersapp.utils.Mapper.map;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{

    private final AdminRepository adminRepository;
    private final ElectionService electionService;


    @Override
    public AdminRegistrationResponse register(AdminRegistrationRequest registrationRequest) {
        Admin admin = map(registrationRequest);
        Admin savedAdmin = adminRepository.save(admin);
        return map(savedAdmin);
    }

    @Override
    public ElectionResponse createAnElection(ElectionRequest electionRequest) {
        return electionService.createAnElection(electionRequest);
    }


}
