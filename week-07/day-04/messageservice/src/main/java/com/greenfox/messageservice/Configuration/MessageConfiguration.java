package com.greenfox.messageservice.Configuration;

import com.greenfox.messageservice.Service.EmailService;
import com.greenfox.messageservice.Service.MessageProceeder;
import com.greenfox.messageservice.Service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageService emailService() {
    return new EmailService();
  }

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }
}
