package com.greenfox.service;

import com.greenfox.Practicingexam3Application;
import com.greenfox.model.Question;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Practicingexam3Application.class)
@WebAppConfiguration
@EnableWebMvc
public class OracleServiceTest {
  private QuestionService questionService;

  @Before
  public void setup() throws Exception {
    questionService = Mockito.mock(QuestionService.class);
  }

  @Test
  public void pickRandomAnswerShouldReturnrandomString() throws Exception {
    Question question = new Question("x");
    when(questionService.checkIfQuestionIsLearned(question.getQuestion())).thenReturn(false);
    when(questionService.pickRandomAnswer().getRandomAnswer()).thenReturn("Without a doubt");

    assertEquals("Without a doubt", question.getAnswer());
  }
}
