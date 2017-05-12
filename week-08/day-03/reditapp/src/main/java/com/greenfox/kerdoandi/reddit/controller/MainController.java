package com.greenfox.kerdoandi.reddit.controller;

import com.greenfox.kerdoandi.reddit.model.Post;
import com.greenfox.kerdoandi.reddit.model.Posts;
import com.greenfox.kerdoandi.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Posts list() {
    Posts posts = new Posts();
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }


  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post score(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.upvote();
    postRepository.save(post);
    return post;
  }


  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downScore(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.downvote();
    postRepository.save(post);
    return post;
  }
}
