package com.greenfox.controller;

import com.greenfox.model.Questions;
import com.greenfox.repository.QuestionAndAnswerRepo;
import com.greenfox.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizRestController {
  @Autowired
  QuestionsService questionsService;
  @Autowired
  QuestionAndAnswerRepo questionAndAnswerRepo;

  @GetMapping("/questions")
  public Questions getQuestions() {
    Questions questions = new Questions();
    questions.setId(1);
    questions.setQuestionList(questionsService.getRandomQuestions());
    return questions;
  }
}
