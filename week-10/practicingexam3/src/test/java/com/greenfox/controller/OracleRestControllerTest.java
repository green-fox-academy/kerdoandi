package com.greenfox.controller;

import com.greenfox.Practicingexam3Application;
import com.greenfox.model.Question;
import com.greenfox.repository.QuestionRepository;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Practicingexam3Application.class)
@WebAppConfiguration
@EnableWebMvc
public class OracleRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;
  @Autowired
  QuestionRepository questionRepository;

  @Before
  public void setup() throws Exception {
    mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void wisdomShouldReturnNrOfQuestions() throws Exception {
    questionRepository.deleteAll();
    questionRepository.save(new Question("x"));
    mockMvc.perform(get("/wisdoms")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(content().json("{\"count\": " + 1 + "}"));
  }

  @Test
  public void dilemmaWOParameterShouldReturnWithRepostMEssage() throws Exception {
    mockMvc.perform(get("/dilemma")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(content().json("{\"reportMessage\": \"I feel a great disturbance in the Force\"}"));
  }

  @Test
  public void dilemmaWithParameterShouldReturnQandAIfQuestionAlreadyExists() throws Exception {
    questionRepository.save(new Question("x", "y"));
    mockMvc.perform(get("/dilemma/?question=x")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(content().json("{\"question\": \"x\"}"))
            .andExpect(content().json("{\"answer\": \"y\"}"));
  }
}