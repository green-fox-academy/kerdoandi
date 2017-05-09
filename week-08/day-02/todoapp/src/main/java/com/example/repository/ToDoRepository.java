package com.example.repository;
import com.example.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
