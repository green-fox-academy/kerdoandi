package com.greenfox.Controler;


import com.greenfox.Model.Bank;
import com.greenfox.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercises {

  @RequestMapping("/exercise1")
  public String listFields(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", false);
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getType());
    return "bankAccount";
  }

  @RequestMapping("/exercise2")
  public String formatDecimals(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", false);
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getType());
    return "bankAccount02";
  }

  @RequestMapping("/exercise3")
  public String addZebra(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", false);
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getType());
    model.addAttribute("currency", " Zebra");
    return "bankAccount03";
  }

  @RequestMapping("/exercise4")
  public String addHtml(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "exercise4";
  }

  @RequestMapping("/exercise5")
  public String getBankAccount(Model model) {
    Bank bank = new Bank();
    bank.addBankAccount(new BankAccount("Tom", 48392,"cat", false));
    bank.addBankAccount(new BankAccount("Jerry", 37425,"mouse", false));
    bank.addBankAccount(new BankAccount("Dumbo", 3562,"elephant", false));

    model.addAttribute("character", bank.getBankAccount(2));
    return "exercise5";
  }

  @RequestMapping("/exercise6")
  public String getBankAccountList(Model model) {
    Bank bank = new Bank();
    bank.addBankAccount(new BankAccount("Tom", 48392,"cat", false));
    bank.addBankAccount(new BankAccount("Jerry", 37425,"mouse", false));
    bank.addBankAccount(new BankAccount("Dumbo", 3562,"elephant", false));

    model.addAttribute("bank", bank);
    return "exercise6";
  }

  @RequestMapping("/exercise7")
  public String getKing(Model model) {
    Bank bank = new Bank();
    bank.addBankAccount(new BankAccount("Tom", 48392,"cat", false));
    bank.addBankAccount(new BankAccount("Jerry", 37425,"mouse", false));
    bank.addBankAccount(new BankAccount("Dumbo", 3562,"elephant", false));
    bank.addBankAccount(new BankAccount("Simba", 4373,"lyon", true));

    model.addAttribute("bank", bank);
    return "exercise7";
  }


  @RequestMapping("/exercise8")
  public String isBadGuy(Model model) {
    Bank bank = new Bank();
    bank.addBankAccount(new BankAccount("Tom", 48392,"cat", false));
    bank.addBankAccount(new BankAccount("Jerry", 37425,"mouse", false));
    bank.addBankAccount(new BankAccount("Dumbo", 3562,"elephant", false));
    bank.addBankAccount(new BankAccount("Simba", 4373,"lyon", true));

    model.addAttribute("bank", bank);
    model.addAttribute("badguy", "Bad Guy");
    model.addAttribute("goodguy", "Good Guy");
    return "exercise8";
  }
}