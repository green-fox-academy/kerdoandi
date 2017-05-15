package com.greenfox;

import com.greenfox.model.Food;
import com.greenfox.model.Foods;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraxController {

  @RequestMapping(value = "/drax", method = RequestMethod.GET)
  public Foods getFoodList() {
    Foods foods = new Foods();
    foods.addFood(new Food("apple", 1, 250));
    foods.addFood(new Food("bread", 1, 600));
    return foods;
  }
}
