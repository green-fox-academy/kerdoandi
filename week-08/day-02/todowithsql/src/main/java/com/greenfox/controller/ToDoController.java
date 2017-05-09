package com.greenfox.controller;


import com.greenfox.models.ToDo;
import com.greenfox.repository.ToDoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  ToDoRepository toDoRepository;

  public ToDoController(ToDoRepository todorepo) {
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

  @RequestMapping("/add")
  public String addTodo(Model model) {
    model.addAttribute("todos", toDoRepository);
    return "newtodo";
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public String addNewTodo(@RequestParam(value = "new_todo", defaultValue = "") String todo) {
    toDoRepository.save(new ToDo(todo));
    return "redirect:/todo/list";
  }


  @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
  public String delete(@PathVariable(value = "id") String id) {
    long todoid = Long.parseLong(id);
    toDoRepository.delete(todoid);
    return "redirect:/todo/list";
  }
}

