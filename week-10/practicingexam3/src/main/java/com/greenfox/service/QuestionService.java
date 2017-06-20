package com.greenfox.service;

import com.greenfox.model.Answer;
import com.greenfox.model.Question;
import com.greenfox.model.ReportMessage;
import com.greenfox.repository.AnswerRepository;
import com.greenfox.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestionService {
  QuestionRepository questionRepository;
  AnswerRepository answerRepository;
  ReportMessage reportMessage;

  @Autowired
  public QuestionService(QuestionRepository questionRepository, AnswerRepository answerRepository, ReportMessage reportMessage) {
    this.questionRepository = questionRepository;
    this.answerRepository = answerRepository;
    this.reportMessage = reportMessage;
  }

  public QuestionService() {
  }

  public boolean checkIfQuestionIsLearned(String questionReceived) {
    for (Question question : questionRepository.findAll()) {
      if(questionReceived.equals(question.getQuestion())) {
        return true;
      }
    }
    return false;
  }

  public Object teachQuestions(Question question) throws Exception {
    if (checkIfQuestionIsLearned(question.getQuestion())) {
      throw new Exception("BAD_REQUEST");
    } else {
      questionRepository.save(question);
      reportMessage.setReportMessage("CREATED");
      return reportMessage;
    }
  }

  public Question givebackAnswer(String questionReceived) throws Exception {
    if (questionReceived == null) {
      throw new Exception("Question is null");
    }
    if (checkIfQuestionIsLearned(questionReceived)) {
      return questionRepository.findQuestionByQuestion(questionReceived);
    } else {
      String randomAnswer = pickRandomAnswer().getRandomAnswer();
      Question question = new Question(questionReceived, randomAnswer);
      questionRepository.save(question);
      return question;
    }
  }

  public Answer pickRandomAnswer() {
    Random random = new Random();
    int limit = (int) answerRepository.count();
    int randomNr = random.nextInt(limit) + 1;
    List<Answer> answerList = (List) answerRepository.findAll();
    return answerList.get(randomNr);
  }
}

