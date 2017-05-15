package com.greenfox.model;
import java.util.ArrayList;
import java.util.List;

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
}
