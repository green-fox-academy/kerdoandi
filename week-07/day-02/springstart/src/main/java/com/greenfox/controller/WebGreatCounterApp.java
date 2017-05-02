package com.greenfox.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class WebGreatCounterApp {
  AtomicLong id = new AtomicLong();
  @RequestMapping("/web/greetingv2")
  public String greeting(Model model, @RequestParam (value= "name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("id", id.getAndIncrement());
    return "greetingv2";
  }
}
