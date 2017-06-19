package com.greenfox.controller;

import com.greenfox.model.Answers;
import com.greenfox.model.ProjectList;
import com.greenfox.model.Questions;
import com.greenfox.service.QuestionAndAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuizRestController {
  @Autowired
  QuestionAndAnswersService questionAndAnswersService;

  @GetMapping("/questions")
  public Questions getQuestions() {
    Questions questions = new Questions();
    questions.setId(1);
    questions.setQuestionList(questionAndAnswersService.getRandomQuestions());
    return questions;
  }

  @PostMapping("/answers")
  public ProjectList postAnswers(@RequestBody Answers answers) {
    RestTemplate rt = new RestTemplate();
    if (questionAndAnswersService.answerValidator(answers)) {
      ProjectList projectList = rt.postForObject("https://springexamserver.herokuapp.com/projects/sabers","request", ProjectList
              .class);
        return projectList;
    } else {
      ProjectList projectList = new ProjectList();
      return projectList;
    }
  }
}
