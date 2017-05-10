package com.greenfox.exercise02_doubling;
import org.springframework.stereotype.Service;

@Service
public class Doubling {
  int received;
  int result;

  public Doubling() {
  }


  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public void setResult(int input) {
    result = 2 * input;
  }
}
