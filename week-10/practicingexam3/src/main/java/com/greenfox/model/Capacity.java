package com.greenfox.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.greenfox.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Capacity {
  @JsonIgnore
  QuestionRepository questionRepository;
  int count;

  @Autowired
  public Capacity(QuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
    count = (int) questionRepository.count();
  }

  public QuestionRepository getQuestionRepository() {
    return questionRepository;
  }

  public void setQuestionRepository(QuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
