package com.greenfox.controller;

import com.greenfox.model.Question;
import com.greenfox.model.ReportMessage;
import com.greenfox.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OracleRestContoller {
  @Autowired
  QuestionService questionService;

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
}
