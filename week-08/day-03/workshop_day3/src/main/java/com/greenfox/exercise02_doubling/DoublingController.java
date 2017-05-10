package com.greenfox.exercise02_doubling;

import com.greenfox.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoublingController {

  @Autowired
  Doubling doubling;

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("Not working!");
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorMessage missingDataException(HttpMessageNotReadableException e) {
    return new ErrorMessage("Please provide a number!");
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling getDouble(@RequestParam(value = "input", required = false) int input) {
    doubling.setReceived(input);
    doubling.setResult(input);
    return doubling;
  }
}
