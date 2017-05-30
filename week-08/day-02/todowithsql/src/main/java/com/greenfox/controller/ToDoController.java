package com.greenfox.controller;

import com.greenfox.models.ToDo;
import com.greenfox.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {
  @Autowired
  ToDoRepository toDoRepository;

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
  public String editToDos(Model model,
                          @PathVariable(value = "id") Long id,
                          @RequestParam(name = "title", required = false) String title,
                          @RequestParam(name = "done", required = false) boolean done,
                          @RequestParam(name = "urgent", required = false) boolean urgent) {
    ToDo toDoToUpdate = toDoRepository.findOne(id);
    if (!title.equals("")) {
      toDoToUpdate.setTitle(title);
    }
    toDoToUpdate.setDone(done);
    toDoToUpdate.setUrgent(urgent);
    toDoRepository.save(toDoToUpdate);
    return "redirect:/todo/list";
  }
}
