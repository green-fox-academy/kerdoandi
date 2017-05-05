package com.example.Controller;

import com.example.Model.Fox;
import com.example.Model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

@Autowired
Fox fox;

  @RequestMapping("/")
  public String information(Model model){
    fox.setName("Andi");
    fox.setDrink("Aperol");
    fox.setFood("pizza");
    Tricks trick1 = new Tricks("play");
    Tricks trick2 = new Tricks("eat");
    fox.addTrick(trick1);
    fox.addTrick(trick2);
    model.addAttribute("object", fox);
    return "index";
  }
}
