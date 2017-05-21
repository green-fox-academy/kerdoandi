package com.example.Controller;

import com.example.Model.Fox;
import com.example.Model.Nutrition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;
  @Autowired
  Nutrition nutrition;

  @RequestMapping("/")
  public String information(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }




}
