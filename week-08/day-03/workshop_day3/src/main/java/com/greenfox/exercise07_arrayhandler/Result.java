package com.greenfox.exercise07_arrayhandler;

public class Result {
  int result;

  public Result() {
  }

  public void setResult(int result) {
    this.result = result;
  }


  public int getResult() {
    return result;
  }

  public void sum(int[] numbers) {
    int temp = 0;
    for (int i : numbers) {
      temp = temp + i;
    }
    this.result = temp;
  }

  public void multiply(int[] numbers) {
    int temp = 1;
    for (int i : numbers) {
      temp = temp * i;
    }
    this.result = temp;
  }
}
