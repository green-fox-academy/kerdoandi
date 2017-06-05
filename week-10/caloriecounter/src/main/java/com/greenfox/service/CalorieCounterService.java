package com.greenfox.service;


import com.greenfox.model.Meal;
import com.greenfox.model.MealType;
import com.greenfox.model.MealWithoutId;
import com.greenfox.model.ResponseStatus;
import com.greenfox.repository.MealTypeRepository;
import com.greenfox.repository.MealsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CalorieCounterService {
  @Autowired
  MealsRepository mealsRepository;
  @Autowired
  MealTypeRepository mealTypeRepository;
  @Autowired
  MealDataValidator mealDataValidator;

  public Iterable<Meal> getMeals() {
    return mealsRepository.findAll();
  }

  public HashMap<String, Number> getStats() {
    HashMap<String, Number> stats = new HashMap<>();
    long nrOfMeals = mealsRepository.count();
    int totalcal = 0;
    for (Meal meal : mealsRepository.findAll()) {
      totalcal += meal.getCalories();
    }
    stats.put("number of meals", nrOfMeals);
    stats.put("total calories", totalcal);
    return stats;
  }


  public Object addNewMeal(MealWithoutId mealWithoutId) {
    ResponseStatus status = new ResponseStatus("OK");
    mealDataValidator.setMissingParamList(mealWithoutId);
    if (mealDataValidator.getMissingParamList().size() != 0) {
      status.setStatus("NOT OK");
      return mealDataValidator;
    } else {
      if(isCorrectMealType(mealWithoutId.getType())) {
        Meal meal = new Meal(mealWithoutId.getDate(), mealWithoutId.getType(), mealWithoutId.getDescription(), mealWithoutId.getCalories
                ());
        mealsRepository.save(meal);
      } else {
        status.setStatus("Please provide correct mealtype");
      }
    }
    return status;
  }

  public boolean isCorrectMealType(String type) {
    boolean isCorrectMealType = false;
    for (MealType mealType : mealTypeRepository.findAll()) {
      if (type.equals(mealType.getName())) {
        isCorrectMealType = true;
      }
    }
    return isCorrectMealType;
  }

  public Object updateMeal(Meal meal) {
    ResponseStatus status = new ResponseStatus("OK");

    mealDataValidator.setMissingParamListOfMeal(meal);
    if (mealDataValidator.getMissingParamList().size() != 0) {
      status.setStatus("NOT OK");
    } else {
      if(isCorrectMealType(meal.getType())) {
        Meal mealToUpdate = mealsRepository.findOne(meal.getId());
        mealToUpdate.setDate(meal.getDate());
        mealToUpdate.setType(meal.getType());
        mealToUpdate.setDescription(meal.getDescription());
        mealToUpdate.setCalories(meal.getCalories());
        mealsRepository.save(mealToUpdate);
      } else {
        status.setStatus("MealType is not correct");
      }
    }
    return status;
  }

  public ResponseStatus deleteMeal(long id) {
    ResponseStatus status = new ResponseStatus("OK");
    mealsRepository.delete(id);
    return status;
  }
}
