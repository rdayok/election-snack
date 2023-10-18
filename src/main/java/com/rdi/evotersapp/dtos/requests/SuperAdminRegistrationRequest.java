package com.rdi.evotersapp.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SuperAdminRegistrationRequest {
    private String email;
    private String password;
}
