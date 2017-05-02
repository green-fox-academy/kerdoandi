package com.greenfox;

import java.util.Random;

public class RandomParameters {
  Random random = new Random();
  int randomNumber;

  public  RandomParameters() {
    randomNumber = random.nextInt(6);
  }

  public String getRandomParameters() {
    String rdm = "param" + randomNumber;
    return rdm;
  }
}
