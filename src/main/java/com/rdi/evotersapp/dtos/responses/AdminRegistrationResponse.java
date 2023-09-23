package com.rdi.evotersapp.dtos.responses;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"id", "firstName", "lastName", "email", "adminRegistrationDate"})
public class AdminRegistrationResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDateTime adminRegistrationDate;
}
