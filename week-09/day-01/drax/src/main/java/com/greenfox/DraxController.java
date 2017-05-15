package com.greenfox;

import com.greenfox.model.Food;
import com.greenfox.model.Foods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DraxController {
  @Autowired
  Foods foods;

  @RequestMapping(value = "/drax", method = RequestMethod.GET)
  public Foods getFoodList() {
    return foods;
  }

  @RequestMapping(value = "/drax/add", method = RequestMethod.POST)
  public Foods addFood(@RequestBody Food food) {
    foods.addFood(food);
    return foods;
  }

  @RequestMapping(value = "/drax/remove", method = RequestMethod.DELETE)
  public Foods removeFood(@RequestParam(value="food") String name) {
    foods.removeFood(name);
    return foods;
  }

  @RequestMapping(value = "/drax/changeamount", method = RequestMethod.PUT)
  public Foods changeFood(@RequestParam(value="food") String name, @RequestParam(value="amount") double amount) {
    foods.changeFoodAmount(name, amount);
    return foods;
  }
}
