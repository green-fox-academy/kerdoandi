package com.greenfox.exercise05_dountil;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DountilController {

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public DoUntil doUntil(@PathVariable(value = "what", required = true) String method, @RequestBody Input input) {
    DoUntil doUntil = new DoUntil();
    if (method.equals("sum")) {
      doUntil.sum(input.getUntil());
    } else if (method.equals("factor")) {
      doUntil.factor(input.getUntil());
    }
    return doUntil;
  }


  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage parameterException(MissingServletRequestParameterException e) {
    return new ErrorMessage( "Please provide a number!");
  }
}
