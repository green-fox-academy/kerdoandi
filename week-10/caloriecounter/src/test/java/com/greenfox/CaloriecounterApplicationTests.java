package com.greenfox;

import com.greenfox.model.Meal;
import com.greenfox.repository.MealsRepository;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CaloriecounterApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class CaloriecounterApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
					MediaType.APPLICATION_JSON.getSubtype(),
					Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	MealsRepository mealsRepository;

	private Meal meal1 = new Meal("Breakfast", "apple",400);
	private Meal meal2 = new Meal("Dinner", "banan",100);

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testGetMeals() throws Exception {
		mealsRepository.deleteAll();
		mealsRepository.save(meal1);
		mealsRepository.save(meal2);
		mockMvc.perform(get("/getMeals"))
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("$.[0].id").value("1"))
						.andExpect(jsonPath("$.[0].type").value("Breakfast"))
						.andExpect(jsonPath("$.[0].description").value("apple"))
						.andExpect(jsonPath("$.[0].calories").value("400"))
						.andExpect(jsonPath("$.[1].calories").value("100"))
						.andExpect(status().isOk());
	}

	@Test
	public void testGetStats() throws Exception {
		mealsRepository.deleteAll();
		mealsRepository.save(meal1);
		mealsRepository.save(meal2);
		mockMvc.perform(get("/getStats"))
						.andExpect(content().contentType(contentType))
						.andExpect(jsonPath("['number of meals']").value("2"))
						.andExpect(jsonPath("['total calories']").value("500"))
						.andExpect(status().isOk());
	}

	@Test
	public void addNewMeal() throws Exception{
		mockMvc.perform(post("/meal")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\n" +
										"     \"date\": \"20170605\",\n" +
										"        \"type\": \"Dinner\",\n" +
										"      \"description\": \"fish\",\n" +
										"      \"calories\": 50\n" +
										"    }"))
						.andExpect(jsonPath("$.status").value("OK"))
						.andExpect(status().isOk());
	}

	@Test
	public void addNewMealWithWrongMealtype() throws Exception{
		mockMvc.perform(post("/meal")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\n" +
										"     \"date\": \"20170605\",\n" +
										"        \"type\": \"Ebed\",\n" +
										"      \"description\": \"fish\",\n" +
										"      \"calories\": 50\n" +
										"    }"))
						.andExpect(jsonPath("$.status").value("Please provide correct mealtype"))
						.andExpect(status().isOk());
	}


	@Test
	public void addNewMealWithMissingParams() throws Exception{
		mockMvc.perform(post("/meal")
						.contentType(MediaType.APPLICATION_JSON)
						.content("{\n" +
										"     \"date\": \"20170605\",\n" +
										"      \"calories\": 50\n" +
										"    }"))
						.andExpect(jsonPath("$.missingParamList").isArray())
						.andExpect(jsonPath("$.missingParamList", Matchers.containsInAnyOrder("type", "description")))
						.andExpect(status().isOk());
	}
}
