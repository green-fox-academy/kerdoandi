package com.greenfox.aze.reddit.model;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Component
@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  String href;
//  long timestamp;
  int score;

  public Post() {

  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
//    timestamp = System.currentTimeMillis() % 1000;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getHref() {
    return href;
  }

  public int getScore() {
    return score;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public void setScore(int score) {
    this.score = score;
  }
//
//  public long getTimestamp() {
//    return timestamp;
//  }
//
//  public void setTimestamp(long timestamp) {
//    this.timestamp = timestamp;
//  }

}
