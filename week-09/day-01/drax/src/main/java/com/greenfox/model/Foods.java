package com.greenfox.model;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Foods {
  List<Food> foods;

  public Foods() {
    foods = new ArrayList<>();
  }

  public List<Food> getFoods() {
    return foods;
  }

  public void setFoods(List<Food> foods) {
    this.foods = foods;
  }

  public void addFood(Food food) {
    foods.add(food);
  }

  public void removeFood(String name) {
    for (Food food : foods) {
      if (food.getName().equals(name)) {
        foods.remove(food);
      }
    }
  }

  public void changeFoodAmount(String name, double amount) {
    for (Food food : foods) {
      if (food.getName().equals(name)) {
        food.setAmount(amount);
      }
    }
  }
}
