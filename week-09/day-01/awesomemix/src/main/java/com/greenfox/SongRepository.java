package com.greenfox;
import com.greenfox.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SongRepository extends CrudRepository<Song, Long> {
  public Iterable<Song> findAllByGenreContains(String genre);
//  public Iterable<Song> findAllByAndOrderByRatingDesc();
}