package com.greenfox;

import com.greenfox.model.Meal;
import com.greenfox.model.MealType;
import com.greenfox.repository.MealTypeRepository;
import com.greenfox.repository.MealsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriecounterApplication implements CommandLineRunner {
	@Autowired
	MealTypeRepository mealTypeRepository;

	@Autowired
	MealsRepository mealsRepository;

	public static void main(String[] args) {
		SpringApplication.run(CaloriecounterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mealTypeRepository.save(new MealType("Breakfast"));
		mealTypeRepository.save(new MealType("Elevenses"));
		mealTypeRepository.save(new MealType("Lunch"));
		mealTypeRepository.save(new MealType("Snack"));
		mealTypeRepository.save(new MealType("Dinner"));
		mealTypeRepository.save(new MealType("Midnight Snack"));

		mealsRepository.save(new Meal("Breakfast", "alma",400));
		mealsRepository.save(new Meal("Dinner", "banan",100));
	}
}
