package com.greenfox.messageservice.Service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
  @Autowired
  MessageService email;

  public MessageProceeder() {
  }

  public void processMessage(String message, String address) {
    email.sendMessage(message, address);
  }
}
