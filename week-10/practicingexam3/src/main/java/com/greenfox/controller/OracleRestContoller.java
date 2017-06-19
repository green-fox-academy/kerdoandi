package com.greenfox.controller;

import com.greenfox.model.Capacity;
import com.greenfox.model.Question;
import com.greenfox.model.ReportMessage;
import com.greenfox.repository.QuestionRepository;
import com.greenfox.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OracleRestContoller {
  QuestionService questionService;
  QuestionRepository questionRepository;

  @Autowired
  public OracleRestContoller(QuestionService questionService, QuestionRepository questionRepository) {
    this.questionService = questionService;
    this.questionRepository = questionRepository;
  }

  @GetMapping("/dilemma")
  public Object getstatus(@RequestParam(value = "question", required = false) String question) {
    try {
      Question question1 = questionService.givebackAnswer(question);
      return question1;
    } catch (Exception e) {
      e.printStackTrace();
      return new ReportMessage();
    }
  }

  @PostMapping("/teach")

  @GetMapping("/wisdoms")
  public Capacity getNrOfQuestions() {
    return new Capacity(questionRepository);
  }
}
