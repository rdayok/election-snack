package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.StateChairmanRegistrationRequest;
import com.rdi.evotersapp.dtos.requests.UserRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.StateChairmanRegistrationResponse;
import com.rdi.evotersapp.dtos.responses.UserRegistrationResponse;
import com.rdi.evotersapp.enums.Gender;
import com.rdi.evotersapp.enums.State;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class StateChairmanRegistrationTest {

    @Autowired
    private UserService userService;
    @Autowired
    private StateChairmanService stateChairmanService;

    @Test
    public void testStateChairmanRegistration() {
        UserRegistrationRequest userRegistrationRequest = registerVoter();
        UserRegistrationResponse voterRegisterResponse
                = userService.registerVoter(userRegistrationRequest);


        StateChairmanRegistrationRequest stateChairmanRegistrationRequest
                = new StateChairmanRegistrationRequest();
        stateChairmanRegistrationRequest.setVoterId(voterRegisterResponse.getId());
        stateChairmanRegistrationRequest.setState(voterRegisterResponse.getState());
        StateChairmanRegistrationResponse stateChairmanRegistrationResponse
                = stateChairmanService.registerStateChairman(stateChairmanRegistrationRequest);

        assertNotNull(stateChairmanRegistrationResponse);
    }

    private static UserRegistrationRequest registerVoter() {
        UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest();
        userRegistrationRequest.setFirstName("Darda");
        userRegistrationRequest.setLastName("Max");
        userRegistrationRequest.setEmail("dayokr@gmail.com");
        userRegistrationRequest.setPassword("iam_niyaz09");
        userRegistrationRequest.setGender(Gender.MALE);
        userRegistrationRequest.setState(State.PLATEAU);
        userRegistrationRequest.setDateOfBirth(LocalDate.of(2000, Month.SEPTEMBER, 8));
        return userRegistrationRequest;
    }

}
