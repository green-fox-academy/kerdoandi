package com.greenfox;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {

  @RequestMapping(value = "/yondu", method =RequestMethod.GET)
  public Yondu getYondu(@RequestParam(value = "distance") double dist,@RequestParam(value = "time") double time) {
    Yondu yondu = new Yondu(dist, time);
    return yondu;
  }
}
