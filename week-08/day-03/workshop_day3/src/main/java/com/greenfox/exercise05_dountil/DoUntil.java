package com.greenfox.exercise05_dountil;

public class DoUntil {
  int result;

  public DoUntil() {
  }

  public void sum(int num) {
    int tempSum = 0;
    for (int i = 0; i <= num; i++) {
      tempSum = tempSum + i;
    }
    this.result = tempSum;
  }

  public void factor(int num) {
    int tempSum = 1;
    for (int i = 1; i <= num; i++) {
      tempSum = tempSum * i;
    }
    this.result = tempSum;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
