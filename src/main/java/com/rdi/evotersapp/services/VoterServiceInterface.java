package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.VoterRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.VoterRegistrationResponse;

public interface VoterServiceInterface {
    public VoterRegistrationResponse registerVoter(VoterRegistrationRequest voterRegistrationRequest);
}
