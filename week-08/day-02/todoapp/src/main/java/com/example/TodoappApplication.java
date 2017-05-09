package com.example;

import com.example.models.ToDo;
import com.example.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication implements CommandLineRunner {
	@Autowired
	ToDoRepository toDoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
		toDoRepository.save(new ToDo("I have to learn Object Relational Mapping2"));
	}
}
