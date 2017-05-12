package com.greenfox.aze.reddit.controller;

import com.greenfox.aze.reddit.model.Post;
import com.greenfox.aze.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Object list() {
    return postRepository.findAll();
  }

  @RequestMapping(value = "/posts")
  public Object list(@RequestBody Post post) {
    postRepository.save(post);
    return postRepository.findAll();
  }

}
