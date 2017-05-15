package com.greenfox.model;

import org.springframework.stereotype.Service;

@Service
public class Ship {
    int caliber25;
    int caliber30;
    int caliber50;
    static String shipstatus;
    static boolean ready;

  public Ship() {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    shipstatus = "empty";
    ready = false;
  }


  public void fillShip(Fill fill) {
    if(fill.getReceived().equals(".25")) {
      caliber25 = caliber25 + fill.getAmount();
    } else if (fill.getReceived().equals(".30")) {
      caliber30 = caliber30 + fill.getAmount();
    } else if (fill.getReceived().equals(".50")) {
      caliber50 = caliber50 + fill.getAmount();
    }
  }

  public void setShipstatus() {
    int maxAmount = 12500;
    int totalRockets = this.caliber25 + this.caliber30 + this.caliber50;
    if (totalRockets == 0) {
      shipstatus = "empty";
    } else if (0 < totalRockets && totalRockets < 12500) {
      String value = String.valueOf((double) totalRockets/maxAmount*100);
      shipstatus = value.concat("%");
    } else if (totalRockets == 12500) {
      shipstatus = "full";
    } else if (totalRockets > 12500) {
      shipstatus = "overloaded";
    }
  }

  public void setReady() {
    if (shipstatus.equals("full")) {
        ready = true;
    } else {
      ready = false;
    }
  }


  public int getCaliber25() {
    return caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

}
