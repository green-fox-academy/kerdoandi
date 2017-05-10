package com.greenfox.exercise03_greeter;

import org.springframework.stereotype.Service;

@Service
public class Greeter {
    String greeting;

  public Greeter() {
  }

  public void setGreeting(String name, String title) {
    String uniqueGreeting = "Oh, hi there %s, my dear %s!";
    greeting = String.format(uniqueGreeting, name, title);
  }

  public String getGreeting() {
    return greeting;
  }
}

