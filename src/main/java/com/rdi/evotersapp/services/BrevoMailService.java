package com.rdi.evotersapp.services;

import com.rdi.evotersapp.config.BrevoMailConfig;
import com.rdi.evotersapp.dtos.requests.EmailRequest;
import com.rdi.evotersapp.dtos.responses.EmailResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Service
@AllArgsConstructor
public class BrevoMailService implements MailService {

    private final BrevoMailConfig brevoMailConfig;
    @Override
    public EmailResponse sendMail(EmailRequest emailRequest) {
        final String URL = brevoMailConfig.getBrevoMailUrl();
        final String MAIL_API_KEY = brevoMailConfig.getBrevoMailApiKey();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("accept", APPLICATION_JSON_VALUE);
        httpHeaders.set("api-key", MAIL_API_KEY);
        HttpEntity<EmailRequest> emailRequestHttpEntity =
                new RequestEntity<>(emailRequest, httpHeaders, HttpMethod.POST, URI.create(""));
        ResponseEntity<EmailResponse> emailPostForEntityResponse =
                restTemplate.postForEntity(URL, emailRequestHttpEntity, EmailResponse.class);
        EmailResponse emailResponse = emailPostForEntityResponse.getBody();
        emailResponse.setCode(emailPostForEntityResponse.getStatusCode().value());
        return emailResponse;
    }
}
