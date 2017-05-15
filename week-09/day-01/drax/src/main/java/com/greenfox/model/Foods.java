package com.greenfox.model;
import java.util.List;

public class Foods {
  List<Food> foods;

  public Foods(List<Food> foods) {
    this.foods = foods;
  }

  public Foods() {
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
