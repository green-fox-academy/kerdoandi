package com.greenfox.Service;

import com.greenfox.Model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaiseMoney {

  @Autowired
  BankAccount bankAccount;

  public void raiseMoney() {
    bankAccount.setBalance(bankAccount.getBalance() + 10);
  }
}
