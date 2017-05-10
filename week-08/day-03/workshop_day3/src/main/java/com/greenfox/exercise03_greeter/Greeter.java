package com.greenfox.exercise03_greeter;

public class Greeter {
  String welcome_message;

  public Greeter() {
  }

  public void setGreeting(String name, String title) {
    String baseGreeting = "Oh, hi there %s, my dear %s!";
    welcome_message = String.format(baseGreeting, name, title);
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}

