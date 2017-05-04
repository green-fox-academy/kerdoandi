package com.greenfox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig{
  @Bean
  public MyColor redColor() {
   return new RedColor();
  }
}
