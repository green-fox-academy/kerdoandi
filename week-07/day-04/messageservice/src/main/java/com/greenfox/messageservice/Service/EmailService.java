package com.greenfox.messageservice.Service;

public class EmailService implements MessageService {
  @Override
  public void sendMessage(String message, String address) {
    String.format("Email Sent to %s with Message=%s", address, message);
  }
}
