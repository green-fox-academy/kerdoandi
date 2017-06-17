package com.greenfox.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class QuestionAndAnswers {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String question;
  String answer;

  public QuestionAndAnswers() {
  }

  public QuestionAndAnswers(String question, String answer) {
    this.question = question;
    this.answer = answer;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
