package com.greenfox.controller;


import com.greenfox.model.Meal;
import com.greenfox.repository.MealTypeRepository;
import com.greenfox.repository.MealsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/meal")
public class MainController {
  @Autowired
  MealTypeRepository mealTypeRepository;
  @Autowired
  MealsRepository mealsRepository;


  @RequestMapping("/")
  public String getMealTypes(Model model) {
    int totalcal = 0;
    Iterable<Meal> mealList = mealsRepository.findAll();
    for (Meal meal : mealList) {
      totalcal += meal.getCalories();
    }

    model.addAttribute("mealtypes", mealTypeRepository.findAll());
    model.addAttribute("meals", mealsRepository.findAll());
    model.addAttribute("nrOfMeals",mealsRepository.count());
    model.addAttribute("totalCal", totalcal);
    return "index";
  }

  @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
  public String editMeal(Model model, @PathVariable(value = "id") Long id) {
    model.addAttribute("meal", mealsRepository.findOne(id));
    model.addAttribute("mealtypes", mealTypeRepository.findAll());
    return "addOrEdit";
  }

  @RequestMapping(value = "/edit/{id}/save", method = RequestMethod.POST)
  public String editMealWithId(Model model, @PathVariable(value = "id") Long id, @RequestParam(value = "type") String
   type, @RequestParam(value = "desc") String desc, @RequestParam(value = "cal")int cal){
    Meal mealToEdit = mealsRepository.findOne(id);
    model.addAttribute("meal", mealToEdit);
    mealToEdit.setDate(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
    mealToEdit.setType(type);
    mealToEdit.setDescription(desc);
    mealToEdit.setCalories(cal);
    mealsRepository.save(mealToEdit);
    return "redirect:/meal/";
  }

  @RequestMapping("/cancel")
  public String cancelEditing() {
    return "redirect:/meal/";
  }

  @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
  public String deleteMeal(Model model, @PathVariable(value = "id") long id) {
    mealsRepository.delete(id);
    return "redirect:/meal/";
  }

  @RequestMapping("/addOrEdit")
  public String saveNewMeal(Model model) {
    model.addAttribute("mealtypes", mealTypeRepository.findAll());
    return "addOrEdit";
  }

  @RequestMapping("/add")
  public String saveNewMeal(Model model, @RequestParam(value = "type") String
          type, @RequestParam(value = "desc") String desc, @RequestParam(value = "cal")int cal) {
    Meal meal = new Meal(type, desc, cal);
    mealsRepository.save(meal);
    return "redirect:/meal/";
  }
}
