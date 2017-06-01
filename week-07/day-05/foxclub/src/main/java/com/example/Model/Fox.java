package com.example.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {
  private String name;
  private List<Trick> trickOptionsList = new ArrayList<>();
  private List<Trick> knownTrickList = new ArrayList<>();
  private String food;
  private String drink;

  public Fox() {
    trickOptionsList.add(new Trick("singing"));
    trickOptionsList.add(new Trick("cooking"));
    trickOptionsList.add(new Trick("joker"));
    name = "Mr. Fox";
  }

  public void addTrickOption(Trick trick) {
    trickOptionsList.add(trick);
  }

  public void learnTrick(Trick trick) {
      knownTrickList.add(trick);
  }
  public void removeTrick(Trick trick) {
    for( int i = 0; i < trickOptionsList.size(); i++) {
      if (trick.getName().equals(trickOptionsList.get(i).getName())) {
        trickOptionsList.remove(i);
      }
    }
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

  public List<Trick> getTrickOptionsList() {
    return trickOptionsList;
  }

  public void setTrickOptionsList(List<Trick> trickOptionsList) {
    this.trickOptionsList = trickOptionsList;
  }

  public List<Trick> getKnownTrickList() {
    return knownTrickList;
  }

  public void setKnownTrickList(List<Trick> knownTrickList) {
    this.knownTrickList = knownTrickList;
  }
}
