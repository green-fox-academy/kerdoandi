package com.greenfox.controller;

import com.greenfox.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  @RequestMapping
  public Greeting greeting() {
    return new Greeting(1, "Hello, World");
  }
}
