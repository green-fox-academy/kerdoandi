package com.greenfox.kerdoandi.reddit.repository;
import com.greenfox.kerdoandi.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{
  public Post findById(long id);
}
