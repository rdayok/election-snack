//package com.rdi.evotersapp.services;
//
//import com.rdi.evotersapp.data.models.Voter;
//import com.rdi.evotersapp.data.repositories.VoterRepository;
//import com.rdi.evotersapp.dtos.requests.VoterRegistrationRequest;
//import com.rdi.evotersapp.dtos.responses.VoterRegistrationResponse;
//import com.rdi.evotersapp.utils.Mapper;
//import org.springframework.stereotype.Service;
//
//
//import static com.rdi.evotersapp.utils.Mapper.map;
//
//@Service
//public class VoterServiceImpl implements VoterService {
//
//
//    private final VoterRepository voterRepository;
//
//
//    public VoterServiceImpl(VoterRepository voterRepository) {
//        this.voterRepository = voterRepository;
//    }
//
//    @Override
//    public VoterRegistrationResponse registerVoter(VoterRegistrationRequest voterRegistrationRequest) {
//        Voter voter = Mapper.map(voterRegistrationRequest);
//        Voter savedVoter = voterRepository.save(voter);
//        return map(savedVoter);
//    }
//
//
//}
