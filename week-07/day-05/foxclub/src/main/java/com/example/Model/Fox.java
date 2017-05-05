package com.example.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {
  String name;
  List<Tricks> trickList;
  String food;
  String drink;

  public Fox() {
    trickList = new ArrayList<>();
  }

  public void addTrick(Tricks trick) {
    trickList.add(trick);
  }


  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setTrickList(List<Tricks> trickList) {
    this.trickList = trickList;
  }

  public List<Tricks> getTrickList() {
    return trickList;
  }
}
