package com.greenfox.kerdoandi.reddit.model;
import java.util.ArrayList;

public class Posts {
  private Iterable<Post> posts;

  public Posts() {
    this.posts = new ArrayList<>();
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }

  public Iterable<Post> getPosts() {
    return posts;
  }
}
