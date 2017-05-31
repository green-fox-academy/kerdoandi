package com.greenfox.Controler;


import com.greenfox.Model.Bank;
import com.greenfox.Model.BankAccount;
import com.greenfox.Service.BankService;
import com.greenfox.Service.RaiseMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Exercises {
  @Autowired
  BankService bankService;

  @Autowired
  RaiseMoney raiseMoney;

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
    model.addAttribute("bank", bankService.getBank());
    return "exercise7";
  }


  @RequestMapping("/exercise8")
  public String isBadGuy(Model model) {
    model.addAttribute("bank", bankService.getBank());
    model.addAttribute("badguy", "Bad Guy");
    model.addAttribute("goodguy", "Good Guy");
    return "exercise8";
  }

  @RequestMapping("/exercise9")
  public String isBadGuyWithSwitch(Model model) {
    model.addAttribute("bank", bankService.getBank());
    model.addAttribute("badguy", "Bad Guy");
    model.addAttribute("goodguy", "Good Guy");
    return "exercise9";
  }

  @RequestMapping("/exercise10")
  public String bankAccountStatus(Model model) {
    model.addAttribute("bank", bankService.getBank());
    model.addAttribute("badguy", "Bad Guy");
    model.addAttribute("goodguy", "Good Guy");
    return "exercise10";
  }

  @RequestMapping("/exercise10/raise")
  public String raiseBalance(@RequestParam("name") String name) {
    BankAccount bankAccountToRaise = bankService.getBankAccountbyName(name);
    bankAccountToRaise.setBalance(10);
    System.out.println(bankAccountToRaise.getBalance());
    System.out.println(bankAccountToRaise.getName());

    return "redirect:/exercise10";
  }


  @RequestMapping("/exercise10/add")
  public String raiseBalance(@RequestParam("name") String name, @RequestParam("balance") int balance, @RequestParam
          ("type") String type, @RequestParam("goodguy") boolean isKing) {
    BankAccount newBankAccount = new BankAccount();
    newBankAccount.setName(name);
    newBankAccount.setBalance(balance);
    newBankAccount.setType(type);
    newBankAccount.setKing(isKing);
    bankService.getBank().addBankAccount(newBankAccount);
    return "redirect:/exercise10";
  }
}