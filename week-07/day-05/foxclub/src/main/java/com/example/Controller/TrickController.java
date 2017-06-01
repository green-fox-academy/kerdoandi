package com.example.Controller;

import com.example.Model.ActionHistory;
import com.example.Model.ActionHistoryList;
import com.example.Model.Fox;
import com.example.Model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrickController {
  @Autowired
  Fox fox;
  @Autowired
  ActionHistoryList actionHistoryList;

  @RequestMapping("/trickcenter")
  public String tricks(Model model) {
    ActionHistory actionHistory = new ActionHistory("Enter the tricks page");
    actionHistoryList.addActions(actionHistory);

    model.addAttribute("fox", fox);
    return "trickcenter";
  }

  @RequestMapping("/addtrick")
  public String addTrick(@RequestParam("new_trick") Trick newTrick) {
    ActionHistory actionHistory = new ActionHistory("Add new trick");
    actionHistoryList.addActions(actionHistory);

    fox.addTrickOption(newTrick);
    System.out.println(fox.getKnownTrickList());
    System.out.println(fox.getTrickOptionsList());
    return "redirect:/trickcenter";
  }

  @RequestMapping("/learnTrick")
  public String learnTrick(Model model, @RequestParam("selected_trick") Trick learntTrick) {
    ActionHistory actionHistory = new ActionHistory("Learn new trick");
    actionHistoryList.addActions(actionHistory);

    fox.learnTrick(learntTrick);
    fox.removeTrick(learntTrick);
    return "redirect:/";
  }
}
