package com.greenfox.repository;

import com.greenfox.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
  public Question findQuestionByQuestion(String questionReceived);
}
