package com.greenfox.model;

import java.util.HashMap;

public class Questions {
  int id;
  HashMap<Long, String> questions;

  public Questions() {
  }

  public Questions(int id, HashMap<Long, String> questions) {
    this.id = id;
    this.questions = questions;
  }

  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public HashMap<Long, String> getQuestions() {
    return questions;
  }

  public void setQuestionList(HashMap<Long, String> questions) {
    this.questions = questions;
  }
}