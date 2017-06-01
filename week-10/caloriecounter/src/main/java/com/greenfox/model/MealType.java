package com.greenfox.model;


import javax.persistence.*;

@Entity
public class MealType {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long Id;
  String name;

  public MealType(String name) {
    this.name = name;
  }

  public MealType() {
  }

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
