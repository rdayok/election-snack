package com.rdi.evotersapp.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class BrevoMailConfig {
    @Value("${mail.api.key}")
    private String brevoMailApiKey;
    @Value("${mail.url}")
    private String brevoMailUrl;
}
