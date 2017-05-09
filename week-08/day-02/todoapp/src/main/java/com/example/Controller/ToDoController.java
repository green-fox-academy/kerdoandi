package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @RequestMapping({"/", "/list"})
  @ResponseBody
  public String list(){
    return "This is my first todo";
  }
}

