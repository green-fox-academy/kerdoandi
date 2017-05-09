package com.greenfox.controller;


import com.greenfox.repository.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  ToDoRepository toDoRepository;

  public ToDoController(ToDoRepository todorepo) {
    toDoRepository = todorepo;
  }

  @RequestMapping({"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", defaultValue = "", required = false) String status){
    model.addAttribute("todos", toDoRepository.findAll());
    if (status.equals("true")){
      model.addAttribute("todos", toDoRepository.findAllByIsDoneIsFalse());
    }
    return "todolist";
  }
}

