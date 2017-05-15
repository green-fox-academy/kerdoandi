package com.greenfox.model;

public class Fill {
  String received;
  int amount;
  String shipstatus;
  boolean ready;


  public Fill(String received, int amount) {
    this.received = received;
    this.amount = amount;
  }

  public String getReceived() {
    return received;
  }

  public int getAmount() {
    return amount;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getShipstatus() {
    return Ship.shipstatus;
}

  public boolean isReady() {
    return Ship.ready;
  }
}
