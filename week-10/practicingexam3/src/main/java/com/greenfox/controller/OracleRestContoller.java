package com.greenfox.controller;

import com.greenfox.model.Capacity;
import com.greenfox.model.Question;
import com.greenfox.model.ReportMessage;
import com.greenfox.repository.QuestionRepository;
import com.greenfox.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OracleRestContoller {
  QuestionService questionService;
  QuestionRepository questionRepository;
  ReportMessage reportMessage;

  @Autowired
  public OracleRestContoller(QuestionService questionService, QuestionRepository questionRepository, ReportMessage reportMessage) {
    this.questionService = questionService;
    this.questionRepository = questionRepository;
    this.reportMessage = reportMessage;
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
  public Object teachQuestion(@RequestBody Question question) {
    try {
      return questionService.teachQuestions(question);
    } catch (Exception e) {
      return e.getLocalizedMessage();
    }
  }

  @GetMapping("/wisdoms")
  public Capacity getNrOfQuestions() {
    return new Capacity(questionRepository);
  }
}
