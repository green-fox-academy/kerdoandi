package com.greenfox.service;

import com.greenfox.model.*;
import com.greenfox.repository.QuestionAndAnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionAndAnswersService {
  @Autowired
  QuestionAndAnswerRepo questionAndAnswerRepo;

  public List<Integer> getFiveRandomIds(int limit) {
    List<Integer> listOfIds = new ArrayList<>();
    Random random = new Random();

    while(listOfIds.size() < 5) {
      int randomnr = (random.nextInt(limit) + 1);
      if (!listOfIds.contains(randomnr)) {
        listOfIds.add(randomnr);
      }
    }
    System.out.println("-------------------Limit is" + limit);
    System.out.println("----------------------------listOfIds is" + listOfIds);
    return listOfIds;
  }

  public List<Question> getRandomQuestions(){
    int limit = (int) questionAndAnswerRepo.count();
    List<Integer> randomFiveIds = getFiveRandomIds(limit);

    List<Question> randomQuestions = new ArrayList<>();
    for (Integer i : randomFiveIds) {
      randomQuestions.add(new Question((long) i, questionAndAnswerRepo.findOne((long) i).getQuestion()));
    }
    return randomQuestions;
  }

  public boolean answerValidator(Questions questions, Answers answers)  {
    System.out.println(answers);
    for (Answer answer : answers.getAnswers()) {
      if (answer.getId() != questions.getQuestions().get(answers.getAnswers().indexOf(answer)).getId() && !answer
              .getAnswer().equals(questionAndAnswerRepo.findOne(answer.getId()).getAnswer())) {
        return false;
      }
    }
    return true;
  }
}
