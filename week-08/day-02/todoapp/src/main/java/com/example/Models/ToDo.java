package com.example.Models;

public class ToDo {
  int id;
  String title;
  boolean isUrgent;
  boolean isDone;

  public ToDo(int id, String title) {
    this.id = id;
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}
