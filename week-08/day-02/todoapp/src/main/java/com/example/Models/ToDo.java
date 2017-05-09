package com.example.models;

import org.springframework.stereotype.Component;

@Component
public class ToDo {
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public ToDo() {
    isUrgent = false;
    isDone = false;
  }
}
