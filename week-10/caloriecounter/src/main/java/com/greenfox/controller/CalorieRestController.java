package com.greenfox.controller;

import com.greenfox.model.*;
import com.greenfox.model.ResponseStatus;
import com.greenfox.service.CalorieCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class CalorieRestController {
  @Autowired
  CalorieCounterService calorieCounterService;

  @RequestMapping("/getMeals")
  public Object getMeals(){
    return calorieCounterService.getMeals();
  }

  @RequestMapping("/getStats")
  public Object getStats(){
    return calorieCounterService.getStats();
  }


  @PostMapping("/meal")
  public ResponseStatus addNewMeal(@RequestBody MealWithoutId mealWithoutId){
    return calorieCounterService.addNewMeal(mealWithoutId);
  }

  @PutMapping("/meal")
  public ResponseStatus updateMeal(@RequestBody Meal meal){
    return calorieCounterService.updateMeal(meal);
  }

  @DeleteMapping("/meal")
  public ResponseStatus deleteMeal(@RequestBody HashMap<String, Long> idToDelete){
    return calorieCounterService.deleteMeal(idToDelete.get("id"));
  }
}
