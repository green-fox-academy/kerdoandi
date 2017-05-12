package com.greenfox.aze.reddit.controller;

import com.greenfox.aze.reddit.model.Post;
import com.greenfox.aze.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Object list() {
    return postRepository.findAll();
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Object addPost(@RequestBody Post post) {
    postRepository.save(post);
    return postRepository.findAll();
  }


  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Object score(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.upvote();
    postRepository.save(post);
    return postRepository.findAll();
  }


  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Object downScore(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.downvote();
    postRepository.save(post);
    return postRepository.findAll();
  }
}
