package com.rdi.evotersapp.services;

import com.rdi.evotersapp.data.models.Voter;
import com.rdi.evotersapp.data.repositories.VoterRepository;
import com.rdi.evotersapp.dtos.requests.VoterRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.VoterRegistrationResponse;
import org.springframework.stereotype.Service;

import static com.rdi.evotersapp.utils.Mapper.mapper;

@Service
public class VoterServiceImpl implements VoterServiceInterface{


    private final VoterRepository voterRepository;
    private Voter voter = new Voter();

    public VoterServiceImpl(VoterRepository voterRepository) {
        this.voterRepository = voterRepository;
    }

    @Override
    public VoterRegistrationResponse registerVoter(VoterRegistrationRequest voterRegistrationRequest) {
        mapper(voter, voterRegistrationRequest);
        Voter savedVoter = voterRepository.save(voter);
        return mapper(savedVoter);
    }
}
