package com.greenfox.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Bank {
  List<BankAccount> baList;

  public Bank() {
    baList = new ArrayList<>();
  }

  public void addBankAccount(BankAccount bankAccount) {
    baList.add(bankAccount);
  }

  public BankAccount getBankAccount(int i) {
    return baList.get(i);
  }
}
