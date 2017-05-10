package com.greenfox.exercise03_greeter;
import com.greenfox.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreeterController {

  @Autowired
  Greeter greeter;

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("Not working!");
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorMessage missingDataException(HttpMessageNotReadableException e) {
    return new ErrorMessage("Please provide a name!");
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeter getGreeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    greeter.setGreeting(name, title);
    return greeter;
  }
}
