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
  public String delete(@PathVariable(value = "id") long id) {
    toDoRepository.delete(id);
    return "redirect:/todo/list";
  }

  @RequestMapping(value = "/edit/{id}")
  public String edit(Model model, @PathVariable(value = "id") Long id) {
    model.addAttribute("todo", toDoRepository.findOne(id));
    return "edit";
  }

  @RequestMapping(value = "/{id}/edit")
  public String editTodos(Model model,
                          @PathVariable(value = "id") Long id,
                          @RequestParam(name = "title", required = false) String title,
                          @RequestParam(name = "active", required = false) boolean active,
                          @RequestParam(name = "urgent", required = false) boolean urgent) {
    if (!title.equals("")) {
      toDoRepository.findOne(id).setTitle(title);
    }
    toDoRepository.findOne(id).setDone(active);
    toDoRepository.findOne(id).setUrgent(urgent);
    toDoRepository.save(toDoRepository.findOne(id));
    return "redirect:/todo/list";
  }
}

