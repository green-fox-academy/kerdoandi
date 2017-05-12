package com.greenfox.aze.reddit.model;

import java.util.List;

public class Posts {
  List<Post> posts;

  public Posts() {

  }


  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  public List<Post> getPosts() {
    return posts;
  }

  public void addPost(Post post) {
    posts.add(post);
  }

}
