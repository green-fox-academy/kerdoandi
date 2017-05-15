package com.greenfox.model;

public class Food {
  String name;
  double amount;
  double calorie;

  public Food() {
  }

  public Food(String name, double amount, double calorie) {
    this.name = name;
    this.amount = amount;
    this.calorie = calorie;
  }

  public String getName() {
    return name;
  }

  public double getAmount() {
    return amount;
  }

  public double getCalorie() {
    return calorie;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setCalorie(double calorie) {
    this.calorie = calorie;
  }
}
