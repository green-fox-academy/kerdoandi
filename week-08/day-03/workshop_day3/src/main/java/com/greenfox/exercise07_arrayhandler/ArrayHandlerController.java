package com.greenfox.exercise07_arrayhandler;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

  @RequestMapping(value = "/arrays", method = RequestMethod.POST)
  public Result getResult(@RequestBody Input input) {
    Result result = new Result();
    if(input.getWhat().equals("sum")) {
      result.sum(input.getNumbers());
    } else if (input.getWhat().equals("multiply")) {
      result.multiply(input.getNumbers());
    }
    return result;
  }
}
