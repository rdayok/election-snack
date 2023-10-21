package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.EmailRequest;
import com.rdi.evotersapp.dtos.responses.EmailResponse;

public interface MailService {
    EmailResponse sendMail(EmailRequest emailRequest);
}
