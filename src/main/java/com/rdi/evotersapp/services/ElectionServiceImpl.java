//package com.rdi.evotersapp.services;
//
//import com.rdi.evotersapp.data.models.Election;
//import com.rdi.evotersapp.data.repositories.ElectionRepository;
//import com.rdi.evotersapp.dtos.requests.ElectionRequest;
//import com.rdi.evotersapp.dtos.responses.ElectionResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import static com.rdi.evotersapp.utils.Mapper.map;
//
//@Service
//@RequiredArgsConstructor
//public class ElectionServiceImpl implements ElectionService{
//
//    private final ElectionRepository electionRepository;
//
//    @Override
//    public ElectionResponse createAnElection(ElectionRequest electionRequest) {
//        Election election = map(electionRequest);
//        Election savedElection = electionRepository.save(election);
//        return map(savedElection);
//    }
//}
