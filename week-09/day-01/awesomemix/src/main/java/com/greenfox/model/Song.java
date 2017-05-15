package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
  @Id
  String author;
  String title;
  String genre;
  int year;
  double rating;

  public Song() {}

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public String getGenre() {
    return genre;
  }

  public int getYear() {
    return year;
  }

  public double getRating() {
    return rating;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }
}
