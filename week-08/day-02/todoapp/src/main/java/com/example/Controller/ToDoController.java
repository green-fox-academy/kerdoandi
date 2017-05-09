package com.example.controller;


import com.example.repository.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  ToDoRepository toDoRepository;

  public ToDoController(ToDoRepository todorepo) {
    toDoRepository = todorepo;
  }

  @RequestMapping({"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", toDoRepository.findAll());
    return "todolist";
  }
}

