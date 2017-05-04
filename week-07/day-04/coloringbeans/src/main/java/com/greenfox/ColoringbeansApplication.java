package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringbeansApplication implements CommandLineRunner {
	@Autowired
	MyColor color;

	public static void main(String[] args) {
		SpringApplication.run(ColoringbeansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		color.printColor();
	}
}
