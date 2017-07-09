package com.greenfox.service;

import com.greenfox.Practicingexam3Application;
import com.greenfox.model.Answer;
import com.greenfox.model.ReportMessage;
import com.greenfox.repository.AnswerRepository;
import com.greenfox.repository.QuestionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Practicingexam3Application.class)
@WebAppConfiguration
@EnableWebMvc
public class OracleServiceTest {
  private QuestionRepository questionRepository;
  private AnswerRepository answerRepository;
  private ReportMessage reportMessage;
  List<Answer> answerlist;
  private Answer a1;
  private Answer a2;
  private Answer a3;

  @Before
  public void setup() throws Exception {
    questionRepository = Mockito.mock(QuestionRepository.class);
    answerRepository = Mockito.mock(AnswerRepository.class);
    reportMessage = Mockito.mock(ReportMessage.class);
    answerlist = new ArrayList<>();
    a1 = new Answer("a");
    a2 = new Answer("b");
    a3 = new Answer("c");
    answerlist.add(a1);
    answerlist.add(a2);
    answerlist.add(a3);
    when(answerRepository.findAll()).thenReturn(answerlist);
    when(answerRepository.count()).thenReturn(3L);
    when(reportMessage.getReportMessage()).thenReturn("valami");
  }

  @Test
  public void pickRandomAnswerShouldReturnrandomString() throws Exception {
    QuestionService questionService = new QuestionService(questionRepository, answerRepository,reportMessage);
    when(questionService.pickRandomAnswer()).thenReturn(a1);
  }
}
