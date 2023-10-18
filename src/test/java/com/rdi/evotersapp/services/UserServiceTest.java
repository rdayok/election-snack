package com.rdi.evotersapp.services;

import com.rdi.evotersapp.enums.State;
import com.rdi.evotersapp.dtos.requests.UserRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.UserRegistrationResponse;
import com.rdi.evotersapp.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserRegistration() {
        UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest();
        userRegistrationRequest.setFirstName("Darda");
        userRegistrationRequest.setLastName("Max");
        userRegistrationRequest.setEmail("dayokr@gmail.com");
        userRegistrationRequest.setPassword("iam_niyaz09");
        userRegistrationRequest.setGender(Gender.MALE);
        userRegistrationRequest.setState(State.PLATEAU);
        userRegistrationRequest.setDateOfBirth(LocalDate.of(2000, Month.SEPTEMBER, 8));
        UserRegistrationResponse voterRegisterResponse
                = userService.registerVoter(userRegistrationRequest);

        assertThat(voterRegisterResponse).isNotNull();
        assertThat(voterRegisterResponse.getId()).isNotNull();
    }



}