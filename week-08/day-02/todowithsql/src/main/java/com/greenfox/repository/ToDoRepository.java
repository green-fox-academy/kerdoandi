package com.greenfox.repository;

import com.greenfox.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
  public List<ToDo> findAllByIsDoneIsFalse();

}
