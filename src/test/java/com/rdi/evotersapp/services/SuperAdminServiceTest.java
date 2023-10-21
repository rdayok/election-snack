package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.SuperAdminRegistrationRequest;
import com.rdi.evotersapp.dtos.responses.RegisterSuperAdminResponse;
import com.rdi.evotersapp.exceptions.CanNotRegisterSuperAdminException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class SuperAdminServiceTest {

    @Autowired
    private SuperAdminService superAdminService;

    @Test
    public void testRegisterSuperAdmin() throws CanNotRegisterSuperAdminException {
        SuperAdminRegistrationRequest superAdminRegistrationRequest = new SuperAdminRegistrationRequest();
        superAdminRegistrationRequest.setEmail("max_ret@yahoo.com");
        superAdminRegistrationRequest.setPassword("GeniusBeingzxpt0813");
        RegisterSuperAdminResponse registerSuperAdminResponse
                = superAdminService.registerSuperAdmin(superAdminRegistrationRequest);

        assertThat(registerSuperAdminResponse).isNotNull();
    }
}
