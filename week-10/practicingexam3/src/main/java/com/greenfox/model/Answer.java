package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
  @Id
  String randomAnswer;

  public Answer() {
  }

  public Answer(String randomAnswer) {
    this.randomAnswer = randomAnswer;
  }

  public String getRandomAnswer() {
    return randomAnswer;
  }

  public void setRandomAnswer(String randomAnswer) {
    this.randomAnswer = randomAnswer;
  }
}
