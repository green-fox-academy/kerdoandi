package com.greenfox.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BankAccount {
  String name;
  int balance;
  String type;


  @Override
  public String toString() {
    return name + " " + balance + " " + type;
  }
}