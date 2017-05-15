package com.greenfox.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Songs {
  public Iterable<Song> songs;


  public Songs() {
    songs = new ArrayList<>();
  }

  public Iterable<Song> getSongs() {
    return songs;
  }

  public void setSongs(Iterable<Song> songs) {
    this.songs = songs;
  }
}
