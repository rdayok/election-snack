package com.rdi.evotersapp.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmailResponse {
    private String messageId;
    private Integer code;
}
