package com.greenfox;

import com.greenfox.model.Answer;
import com.greenfox.model.Question;
import com.greenfox.repository.AnswerRepository;
import com.greenfox.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practicingexam3Application implements CommandLineRunner{
	@Autowired
	QuestionRepository questionRepository;
	@Autowired
	AnswerRepository answerRepository;
	public static void main(String[] args) {
		SpringApplication.run(Practicingexam3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepository.save(new Question("valami", "valami"));
		answerRepository.save(new Answer("It is certain"));
		answerRepository.save(new Answer("Without a doubt"));
		answerRepository.save(new Answer("Yes - definitely"));
		answerRepository.save(new Answer("You may rely on it"));
		answerRepository.save(new Answer("As I see it, yes"));
		answerRepository.save(new Answer("Signs point to yes"));
		answerRepository.save(new Answer("Ask again later"));
		answerRepository.save(new Answer("Better not tell you now"));
		answerRepository.save(new Answer("The problem is not the problem. The problem is your attitude about the problem"));
	}
}
