package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.ElectionRequest;
import com.rdi.evotersapp.dtos.responses.ElectionResponse;

public interface ElectionService {
    public ElectionResponse createAnElection(ElectionRequest electionRequest);
}
