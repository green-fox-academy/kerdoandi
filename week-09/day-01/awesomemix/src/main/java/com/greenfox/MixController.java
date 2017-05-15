package com.greenfox;

import com.greenfox.model.Song;
import com.greenfox.model.Songs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MixController {

  @Autowired
  SongRepository songRepo;

  @RequestMapping(value = "/awesome", method = RequestMethod.GET)
  public Songs listSongs() {
    Songs songs = new Songs();
    songs.setSongs(songRepo.findAll());
    return songs;
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public Song addSong(@RequestBody Song song) {
    songRepo.save(song);
    return song;
  }

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public Songs listSongs(@RequestParam(value = "genre") String genre) {
    Songs songs = new Songs();
    songs.setSongs(songRepo.findAllByGenreContains(genre));
    return songs;
  }
}
