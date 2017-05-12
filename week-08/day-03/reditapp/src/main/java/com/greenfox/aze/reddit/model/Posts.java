package com.greenfox.aze.reddit.model;

import java.util.List;

public class Posts {
  Iterable<Post> posts;

  public Posts() {

  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  public Iterable<Post> getPosts() {
    return posts;
  }
}
