package com.rdi.evotersapp.utils;

import com.rdi.evotersapp.data.models.Voter;
import com.rdi.evotersapp.dtos.requests.VoterRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.VoterRegistrationResponse;

public class Mapper {

    private static VoterRegistrationResponse voterRegistrationResponse = new VoterRegistrationResponse();

    public static void mapper(Voter voter, VoterRegistrationRequest voterRegistrationRequest) {
        voter.setId(voterRegistrationRequest.getId());
        System.out.println(voterRegistrationRequest.getId());
        voter.setFirstName(voterRegistrationRequest.getFirstName());
        voter.setLastName(voterRegistrationRequest.getLastName());
        voter.setDateOfBirth(voterRegistrationRequest.getDateOfBirth());
        voter.setGender(voterRegistrationRequest.getGender());
        voter.setState(voterRegistrationRequest.getState());
        voter.setLocalGovernment(voterRegistrationRequest.getLocalGovernment());
        voter.setDistrict(voterRegistrationRequest.getDistrict());
    }

    public static VoterRegistrationResponse mapper(Voter savedVoter) {
        voterRegistrationResponse.setId(savedVoter.getId());
        voterRegistrationResponse.setFirstName(savedVoter.getFirstName());
        voterRegistrationResponse.setLastName(savedVoter.getLastName());
        voterRegistrationResponse.setDateOfBirth(savedVoter.getDateOfBirth());
        voterRegistrationResponse.setGender(savedVoter.getGender());
        voterRegistrationResponse.setState(savedVoter.getState());
        voterRegistrationResponse.setLocalGovernment(savedVoter.getLocalGovernment());
        voterRegistrationResponse.setDistrict(savedVoter.getDistrict());
        voterRegistrationResponse.setVoterRegistrationDate(savedVoter.getVoterRegistrationDate());
        return voterRegistrationResponse;
    }
}
