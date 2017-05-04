package com.greenfox.messageservice.Service;

public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String message, String address) {
    String.format("Twitter message Sent to %s with Message=%s", address, message);
  }
}
