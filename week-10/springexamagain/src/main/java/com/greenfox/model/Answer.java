package com.greenfox.model;


public class Answer {
  long id;
  String answer;

  public Answer() {
  }

  public Answer(long id, String answer) {
    this.id = id;
    this.answer = answer;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}
