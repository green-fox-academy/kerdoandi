package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
  @Id
  String question;
  String answer;

  public Question() {
  }

  public Question(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }


  public Question(String question) {
    this.question = question;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}
