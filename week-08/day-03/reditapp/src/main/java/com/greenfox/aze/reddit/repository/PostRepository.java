package com.greenfox.aze.reddit.repository;

import com.greenfox.aze.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{
}
