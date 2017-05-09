package com.greenfox.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity
@Getter
@Setter
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public ToDo() {
    isUrgent = false;
    isDone = false;
  }

  public ToDo(String title) {
    this.title = title;
    isUrgent = false;
    isDone = false;
  }
}
