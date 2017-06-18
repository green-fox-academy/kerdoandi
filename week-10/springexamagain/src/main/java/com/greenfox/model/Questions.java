package com.greenfox.model;

import java.util.ArrayList;
import java.util.List;

public class Questions {
  int id;
  List<Question> questions;

  public Questions() {
    questions = new ArrayList<>();
  }

  public Questions(int id, List<Question> questions) {
    this.id = id;
    this.questions = questions;
  }

  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestionList(List<Question> questions) {
    this.questions = questions;
  }
}