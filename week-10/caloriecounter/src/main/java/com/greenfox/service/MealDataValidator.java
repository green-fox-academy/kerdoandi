package com.greenfox.service;

import com.greenfox.model.Meal;
import com.greenfox.model.MealWithoutId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealDataValidator {
  List<String> missingParamList = new ArrayList<>();

  public MealDataValidator() {
  }

  public List<String> getMissingParamList() {
    return missingParamList;
  }

  public void setMissingParamList(MealWithoutId mealWithoutId) {
    String date = mealWithoutId.getDate();
    String type = mealWithoutId.getType();
    String description = mealWithoutId.getDescription();
    int calories = mealWithoutId.getCalories();

    if (date == null || date.isEmpty()) {
      missingParamList.add("date");
    }

    if (type == null || type.isEmpty()) {
      missingParamList.add("type");
    }

    if (description == null || description.isEmpty()) {
      missingParamList.add("description");
    }

    if (calories == 0) {
      missingParamList.add("calories");
    }
  }

  public void setMissingParamListOfMeal(Meal meal) {
    long id = meal.getId();
    String date = meal.getDate();
    String type = meal.getType();
    String description = meal.getDescription();
    int calories = meal.getCalories();

    if (id == 0L || date.isEmpty()) {
      missingParamList.add("id");
    }

    if (date == null || date.isEmpty()) {
      missingParamList.add("date");
    }

    if (type == null || type.isEmpty()) {
      missingParamList.add("type");
    }

    if (description == null || description.isEmpty()) {
      missingParamList.add("description");
    }

    if (calories == 0) {
      missingParamList.add("calories");
    }
  }
}
