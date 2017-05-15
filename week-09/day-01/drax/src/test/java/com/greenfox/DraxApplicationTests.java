package com.greenfox;

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

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DraxApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class DraxApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
					MediaType.APPLICATION_JSON.getSubtype(),
					Charset.forName("utf8"));

	private final String NEW_FOOD = "{\"name\" : \"milk\",\"amount\" : \"2.0\", \"calorie\" : \"158.0\" }";

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testStatusIsOk() throws Exception {
		mockMvc.perform(get("/drax"))
						.andExpect(status().isOk());
	}


//	@Test
//	public void testAddFood() throws Exception {
//		mockMvc.perform(post("/drax/add")
//						.content(NEW_FOOD)
//						.contentType(MediaType.APPLICATION_JSON_UTF8))
//						.andExpect(status().isOk())
//						.andExpect(content().json(" {\"foods\": [{\"name\": \"milk\", \"amount\": \"2.0\", \"calorie\": \"158.0\"}]}"));
//	}
}
