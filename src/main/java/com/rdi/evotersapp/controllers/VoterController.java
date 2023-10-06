//package com.rdi.evotersapp.controllers;
//
//import com.rdi.evotersapp.dtos.requests.VoterRegistrationRequest;
//import com.rdi.evotersapp.dtos.responses.VoterRegistrationResponse;
//import com.rdi.evotersapp.services.VoterService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/voters")
//@RequiredArgsConstructor
//public class VoterController {
//
//    private final VoterService voterService;
//
//    @PostMapping
//    public ResponseEntity<VoterRegistrationResponse> voter(@RequestBody VoterRegistrationRequest voterRegistrationRequest) {
//        VoterRegistrationResponse saveVoter = voterService.registerVoter(voterRegistrationRequest);
//        return new ResponseEntity<>(saveVoter, HttpStatus.OK);
//    }
//
//
//}
