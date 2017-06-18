package com.greenfox.model;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Answers {
  int id;
  List<Answer> answers;

  public Answers() {
    answers = new ArrayList<>();
  }

  public Answers(int id, List<Answer> answers) {
    this.id = id;
    this.answers = answers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }
}
