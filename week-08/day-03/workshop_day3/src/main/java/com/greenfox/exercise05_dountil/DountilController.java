package com.greenfox.exercise05_dountil;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DountilController {

  @RequestMapping(value = "dountil/{what}", method = RequestMethod.GET)
  public DoUntil getdoUntil(@PathVariable(value = "what", required = true) int input) {
    DoUntil doUntil = new DoUntil();
    doUntil.setUntil(input);
    return doUntil;
  }


  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage parameterException(MissingServletRequestParameterException e) {
    return new ErrorMessage( "Please provide a number!");
  }
}
