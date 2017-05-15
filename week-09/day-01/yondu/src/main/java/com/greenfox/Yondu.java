package com.greenfox;

public class Yondu {
  double distance;
  double time;
  double speed;

  public Yondu (double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance/time;
  }

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {
    return speed;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }
}
