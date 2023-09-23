package com.rdi.evotersapp.utils;

import com.rdi.evotersapp.data.models.Admin;
import com.rdi.evotersapp.data.models.Voter;
import com.rdi.evotersapp.dtos.requests.AdminRegistrationRequest;
import com.rdi.evotersapp.dtos.requests.VoterRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.AdminRegistrationResponse;
import com.rdi.evotersapp.dtos.responses.VoterRegistrationResponse;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

public class Mapper {

    private static final ModelMapper modelMapper = new ModelMapper();


    public static Admin map(AdminRegistrationRequest registrationRequest){
        Admin admin = modelMapper.map(registrationRequest, Admin.class);
        admin.setAdminRegistrationDate(LocalDateTime.now());
        return admin;        
    }

    public static AdminRegistrationResponse map(Admin savedAdminn) {
        return modelMapper.map(savedAdminn, AdminRegistrationResponse.class);
    }

    public static Voter map(VoterRegistrationRequest voterRegistrationRequest) {
        Voter voter = modelMapper.map(voterRegistrationRequest, Voter.class);
        voter.setVoterRegistrationDate(LocalDateTime.now());
        return voter;
    }

    public static VoterRegistrationResponse map(Voter savedVoter) {
        return modelMapper.map(savedVoter, VoterRegistrationResponse.class);
    }
}
