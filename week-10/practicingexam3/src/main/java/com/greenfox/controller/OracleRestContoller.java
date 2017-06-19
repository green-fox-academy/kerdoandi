package com.greenfox.controller;

import com.greenfox.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OracleRestContoller {
  @Autowired
  QuestionService questionService;

  @GetMapping("dilemma")
  public Object getstatus(@RequestParam(value = "question", required = true) String question) throws
          MissingServletRequestParameterException {
    return questionService.givebackAnswer(question);
  }
}
