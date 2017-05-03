package com.greenfox.Controler;


import com.greenfox.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercises {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
  @RequestMapping("/exercise2")
  public String listFields(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("type", bankAccount.getType());
    return "bankAccount";
  }
}