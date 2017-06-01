package com.example.Controller;

import com.example.Model.ActionHistory;
import com.example.Model.ActionHistoryList;
import com.example.Model.Fox;
import com.example.Model.Nutrition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;
  @Autowired
  Nutrition nutrition;
  @Autowired
  ActionHistoryList actionHistoryList;

  @RequestMapping("/")
  public String information(Model model) {
    ActionHistory actionHistory = new ActionHistory("Enter the main page");
    actionHistoryList.addActions(actionHistory);

    model.addAttribute("fox", fox);
    model.addAttribute("learntTricks", fox.getKnownTrickList());
    model.addAttribute("latestActions", actionHistoryList.getLatestactions());
    return "index";
  }

  @RequestMapping("/actionHistory")
  public String actionHistory(Model model) {
    ActionHistory actionHistory = new ActionHistory("Enter the actions page");
    actionHistoryList.addActions(actionHistory);

    model.addAttribute("actions", actionHistoryList.getActionHistoryList());
    return "actionHistory";
  }
}
