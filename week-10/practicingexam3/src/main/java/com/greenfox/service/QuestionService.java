package com.greenfox.service;

import com.greenfox.model.Answer;
import com.greenfox.model.Question;
import com.greenfox.repository.AnswerRepository;
import com.greenfox.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestionService {
  @Autowired
  QuestionRepository questionRepository;

  @Autowired
  AnswerRepository answerRepository;

  public boolean checkIfQuestionIsLearned(String questionReceived) {
    for (Question question : questionRepository.findAll()) {
      if(questionReceived.equals(question.getQuestion())) {
        return true;
      }
    }
    return false;
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

