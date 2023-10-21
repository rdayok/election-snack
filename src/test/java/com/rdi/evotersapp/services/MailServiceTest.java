package com.rdi.evotersapp.services;

import com.rdi.evotersapp.dtos.requests.EmailRequest;
import com.rdi.evotersapp.dtos.requests.Recipient;
import com.rdi.evotersapp.dtos.requests.Sender;
import com.rdi.evotersapp.dtos.responses.EmailResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testSendMail() {
        EmailRequest emailRequest = new EmailRequest();
        Recipient recipient = new Recipient();
        recipient.setEmail("dayokr@gmail.com");
        recipient.setName("Darda");
        List<Recipient> recipients = List.of(recipient);

        emailRequest.setRecipients(recipients);
        emailRequest.setHtmlContent("<p>I am testing my app email service");
        emailRequest.setSubject("-> Testing.....");

        EmailResponse emailResponse = mailService.sendMail(emailRequest);
        assertNotNull(emailResponse);
        assertNotNull(emailResponse.getMessageId());
        assertNotNull(emailResponse.getCode());
        assertEquals(201, emailResponse.getCode());

    }
}
