package com.example.Controller;

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

  @RequestMapping("/nutritionStore")
  public String addNutrition(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("nutrition", nutrition);
    return "nutritionStore";
  }

  @RequestMapping("/addNutrition")
  public String addNutrition(@RequestParam("new_food") String foodParam, @RequestParam("new_drink") String drinkParam) {
    nutrition.addFood(foodParam);
    nutrition.addDrink(drinkParam);
    fox.setFood(foodParam);
    fox.setDrink(drinkParam);
    return "redirect:/";
  }

  @RequestMapping("/changeNutrition")
  public String changeNutrition(@RequestParam("selected_food") String sfoodParam, @RequestParam("selected_drink") String sdrinkParam) {
    fox.setFood(sfoodParam);
    fox.setDrink(sdrinkParam);
    return "redirect:/";
  }
}
