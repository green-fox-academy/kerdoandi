package com.greenfox;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuardianController {

  @RequestMapping(value = "/groot", method =RequestMethod.GET)
  public Groot getGroot(@RequestParam(value = "message", required = true) String received) {
    Groot groot = new Groot(received);
    return groot;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage parameterException(MissingServletRequestParameterException e) {
    String parameter = e.getParameterName();
    return new ErrorMessage("I am groot!");
  }
}
