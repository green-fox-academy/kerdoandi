package com.greenfox.exercise04_appenda;

/**
 * Created by Andi on 5/10/2017.
 */
public class Append {
  String appended;

  public Append() {
  }

  public void setAppended(String toAppend) {
    appended = toAppend + "a";
  }

  public String getAppended() {
    return appended;
  }
}
