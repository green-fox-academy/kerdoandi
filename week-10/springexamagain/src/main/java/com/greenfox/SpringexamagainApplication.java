package com.greenfox;

import com.greenfox.model.QuestionAndAnswers;
import com.greenfox.repository.QuestionAndAnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringexamagainApplication implements CommandLineRunner{
	@Autowired
	QuestionAndAnswerRepo questionAndAnswerRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringexamagainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionAndAnswerRepo.save(new QuestionAndAnswers("What is the color code of Green Fox?", "Green"));
		questionAndAnswerRepo.save(new QuestionAndAnswers("When did your course start?", "2017.03.14"));
		questionAndAnswerRepo.save(new QuestionAndAnswers("What type of dog Barbi has?", "whippet"));
		questionAndAnswerRepo.save(new QuestionAndAnswers("What is HerrNorbert's favourite color?", "green"));
		questionAndAnswerRepo.save(new QuestionAndAnswers("How many classes are learning at Green Fox Academy at this " +
						"moment?", "4"));
		questionAndAnswerRepo.save(new QuestionAndAnswers("How many mentors teach at Green Fox at this moment?", "16"));
		questionAndAnswerRepo.save(new QuestionAndAnswers("What was the name of the first Green Fox class?", "Vulpes"));
		questionAndAnswerRepo.save(new QuestionAndAnswers("How many likes do we have on facebook?", "3300"));
	}
}
