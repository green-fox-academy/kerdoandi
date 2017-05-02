package com.greenfox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringStartController {
  @RequestMapping (value = "/home")
  @ResponseBody
  public String sayHello() {
    return "Hello World";
  }
}
