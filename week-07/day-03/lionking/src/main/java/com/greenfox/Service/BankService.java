package com.greenfox.Service;


import com.greenfox.Model.Bank;
import com.greenfox.Model.BankAccount;
import org.springframework.stereotype.Service;

@Service
public class BankService {
  Bank bank = new Bank();
  BankAccount ba1 = new BankAccount("Tom", 48392,"cat", false);
  BankAccount ba2 = new BankAccount("Jerry", 37425,"mouse", false);
  BankAccount ba3 = new BankAccount("Dumbo", 3562,"elephant", false);
  BankAccount ba4 = new BankAccount("Simba", 4373,"lyon", true);

  public BankService() {
    bank.addBankAccount(ba1);
    bank.addBankAccount(ba2);
    bank.addBankAccount(ba3);
    bank.addBankAccount(ba4);
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public BankAccount getBa1() {
    return ba1;
  }

  public void setBa1(BankAccount ba1) {
    this.ba1 = ba1;
  }

  public BankAccount getBa2() {
    return ba2;
  }

  public void setBa2(BankAccount ba2) {
    this.ba2 = ba2;
  }

  public BankAccount getBa3() {
    return ba3;
  }

  public void setBa3(BankAccount ba3) {
    this.ba3 = ba3;
  }

  public BankAccount getBa4() {
    return ba4;
  }

  public void setBa4(BankAccount ba4) {
    this.ba4 = ba4;
  }



  public BankAccount getBankAccountbyName(String name) {
    for (int i = 0; i < bank.getBaList().size(); i++ ) {
      if (bank.getBaList().get(i).getName().equals(name)) {
        return bank.getBaList().get(i);
      }
    }
    return null;
  }
}
