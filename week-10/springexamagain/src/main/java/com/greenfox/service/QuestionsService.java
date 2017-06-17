package com.greenfox.service;

import com.greenfox.model.QuestionAndAnswers;
import com.greenfox.repository.QuestionAndAnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Service
public class QuestionsService {
  @Autowired
  QuestionAndAnswerRepo questionAndAnswerRepo;
  @Autowired
  QuestionAndAnswers questionAndAnswers;

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

  public HashMap<Long, String> getRandomQuestions(){
    int limit = (int) questionAndAnswerRepo.count();
    List<Integer> randomFiveIds = getFiveRandomIds(limit);

    HashMap<Long, String> randomQuestions = new HashMap<>();
    for (Integer i : randomFiveIds) {
      randomQuestions.put(Long.valueOf(i), questionAndAnswerRepo.findOne((long) i).getQuestion());
    }
    return randomQuestions;
  }
}
