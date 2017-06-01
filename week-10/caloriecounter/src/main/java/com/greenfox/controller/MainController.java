package com.greenfox.controller;


import com.greenfox.repository.MealTypeRepository;
import com.greenfox.repository.MealsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/meal")
public class MainController {
  @Autowired
  MealTypeRepository mealTypeRepository;
  @Autowired
  MealsRepository mealsRepository;


  @RequestMapping("/")
  public String getMealTypes(Model model) {
    model.addAttribute("mealtypes", mealTypeRepository.findAll());
    model.addAttribute("meals", mealsRepository.findAll());
    model.addAttribute("nrOfMeals",mealsRepository.count());
    return "index";
  }

  @RequestMapping("/edit/{id}")
  public String editMeal(Model model, @PathVariable(value = "id") Long id) {
    model.addAttribute("editmeal", mealsRepository.findOne(id));
    return "edit";
  }


  @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
  public String deleteMeal(Model model, @PathVariable(value = "id") long id) {
    mealsRepository.delete(id);
    return "redirect:/meal/";
  }
}
