package com.rdi.evotersapp.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Recipient {
    private String email;
    private String name;
}
