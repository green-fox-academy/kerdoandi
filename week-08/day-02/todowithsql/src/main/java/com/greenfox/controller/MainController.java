package com.greenfox.controller;


import com.greenfox.repository.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class MainController {
  ToDoRepository toDoRepository;

  public MainController(ToDoRepository todorepo) {
    toDoRepository = todorepo;
  }

  @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
  public String list(Model model, @RequestParam(value = "isActive", defaultValue = "", required = false) String status){
    model.addAttribute("todos", toDoRepository.findAll());
      if (status.equals("true")){
      model.addAttribute("todos", toDoRepository.findAllByIsDoneIsFalse());
    }
    return "todolist";
  }


}

