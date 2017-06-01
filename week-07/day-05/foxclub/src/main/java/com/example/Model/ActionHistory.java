package com.example.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ActionHistory {
  String currentTime;
  String activity;


  public ActionHistory(String activity) {
    currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy. MM. dd. HH:mm:ss"));
    this.activity = activity;
  }

  @Override
  public String toString() {
    return currentTime + ": " + activity;
  }
}
