package com.rdi.evotersapp.dtos.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AdminRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
