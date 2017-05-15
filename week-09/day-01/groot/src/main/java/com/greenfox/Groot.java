package com.greenfox;

public class Groot {
  String received;
  String translated;

  public Groot(String received) {
    this.received = received;
    translated = "I am Groot!";
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }
}
