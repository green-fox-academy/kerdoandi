package com.greenfox;

public class RedColor implements MyColor{
  public RedColor() {

  }

  @Override
  public void printColor() {
    System.out.println("It's a " + getColor() + " color.");
    }

  public String getColor() {
    return "red";
  }
}
