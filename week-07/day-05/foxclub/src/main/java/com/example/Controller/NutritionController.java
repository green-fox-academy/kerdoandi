package com.example.Controller;

import com.example.Model.ActionHistory;
import com.example.Model.ActionHistoryList;
import com.example.Model.Fox;
import com.example.Model.Nutrition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {
  @Autowired
  Fox fox;
  @Autowired
  Nutrition nutrition;
  @Autowired
  ActionHistoryList actionHistoryList;

  @RequestMapping("/nutritionStore")
  public String addNutrition(Model model) {
    ActionHistory actionHistory = new ActionHistory("Enter the nutrition store page");
    actionHistoryList.addActions(actionHistory);

    model.addAttribute("fox", fox);
    model.addAttribute("nutrition", nutrition);
    return "nutritionStore";
  }

  @RequestMapping("/addNutrition")
  public String addNutrition(@RequestParam("new_food") String foodParam, @RequestParam("new_drink") String drinkParam) {
    ActionHistory actionHistory = new ActionHistory("Add new nutritions: " + foodParam + ", " + drinkParam);
    actionHistoryList.addActions(actionHistory);

    nutrition.addFood(foodParam);
    nutrition.addDrink(drinkParam);
    fox.setFood(foodParam);
    fox.setDrink(drinkParam);
    return "redirect:/";
  }

  @RequestMapping("/changeNutrition")
  public String changeNutrition(Model model, @RequestParam("selected_food") String sfoodParam, @RequestParam
  ("selected_drink") String sdrinkParam) {
    ActionHistory actionHistory = new ActionHistory("Changed food from: " + fox.getFood() + " to: " + sfoodParam + "" +
            " and drink from: " + fox.getDrink() + " to: " + sdrinkParam);
    actionHistoryList.addActions(actionHistory);

    fox.setFood(sfoodParam);
    fox.setDrink(sdrinkParam);
    model.addAttribute("currentFood", fox.getFood());
    model.addAttribute("currentDrink", fox.getDrink());
    return "redirect:/";
  }
}
