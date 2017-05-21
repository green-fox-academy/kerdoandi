package com.example.Controller;

import com.example.Model.Fox;
import com.example.Model.Nutrition;
import com.example.Model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrickController {
  @Autowired
  Fox fox;
  @Autowired
  Nutrition nutrition;

  @RequestMapping("/trickcenter")
  public String tricks(Model model) {
    model.addAttribute("fox", fox);
    return "trickcenter";
  }

  @RequestMapping("/addtrick")
  public String changeNutrition(@RequestParam("new_trick") Tricks newTrick) {
    fox.addTrick(newTrick);
    return "redirect:/";
  }
}
