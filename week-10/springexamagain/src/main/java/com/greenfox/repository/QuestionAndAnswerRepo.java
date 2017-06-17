package com.greenfox.repository;

import com.greenfox.model.QuestionAndAnswers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionAndAnswerRepo extends CrudRepository<QuestionAndAnswers, Long> {
}
