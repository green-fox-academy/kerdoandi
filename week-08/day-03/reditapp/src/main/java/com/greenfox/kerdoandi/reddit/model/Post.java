package com.greenfox.kerdoandi.reddit.model;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Component
@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(nullable = false)
  private String title;
  @Column(nullable = false)
  private String href;
  private Timestamp timestamp;
  @Column(nullable = false)
  private int score;

  public Post() {
    score = 0;
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000 );
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000 );
    score = 0;
  }

  public Post(String title, String href, int score) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis() / 1000);
    this.score = score;
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

  public void upvote() {
    this.score++;
  }

  public void downvote() {
    this.score--;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }
}
