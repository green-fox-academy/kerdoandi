package com.greenfox;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping(value = "/groot", method =RequestMethod.GET)
  public Groot getGroot(@RequestParam(value = "message") String received) {
    Groot groot = new Groot(received);
    return groot;
  }
}
