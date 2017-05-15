package com.greenfox;

import com.greenfox.model.Fill;
import com.greenfox.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoController {
  @Autowired
  Ship ship;

  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Ship getShipstatus() {
    return ship;
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public Fill fillShip(@RequestParam(value = "caliber") String caliber, @RequestParam(value = "amount") int amount) {
    Fill fill = new Fill(caliber, amount);
    ship.fillShip(fill);
    ship.setShipstatus();
    ship.setReady();
    return fill;
  }
}
