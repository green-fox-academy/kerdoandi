package com.greenfox.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Meal {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String date;
  String type;
  String description;
  int calories;

  public Meal() {
  }

  public Meal(String type, String description, int calories) {
    date = LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE);
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public boolean isMealTypeSelected(MealType mealType) {
    return mealType.equals(type);
  }
}
