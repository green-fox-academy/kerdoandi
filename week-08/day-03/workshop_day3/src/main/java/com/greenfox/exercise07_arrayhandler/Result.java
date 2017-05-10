package com.greenfox.exercise07_arrayhandler;

public class Result {
  Object result;

  public Result() {
  }

  public void setResult(int result) {
    this.result = result;
  }


  public Object getResult() {
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

  public void toDouble(int[] numbers) {
    int[] temp = new int[numbers.length];
    for  (int i = 0; i < numbers.length; i++) {
      temp[i] = numbers[i] * 2;
    }
    this.result = temp;
  }
}
