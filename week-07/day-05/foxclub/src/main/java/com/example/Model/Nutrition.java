package com.example.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Nutrition {
  private List<String> food;
  private List<String> drinks;

  public Nutrition() {
    food = new ArrayList<>();
    drinks = new ArrayList<>();
  }

  public void addFood(String input) {
    food.add(input);
  }

  public void addDrink(String input) {
    drinks.add(input);
  }

  public List<String> getFoodList() {
    return food;
  }

  public List<String> getDrinkList() {
    return drinks;
  }
}
