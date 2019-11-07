package com.example.service;

import com.example.model.Song;
import org.springframework.http.HttpStatus;

public interface SongService {

    public Iterable<Song> getAll();

    public Song searchById(long id);

    public Iterable<Song> searchByTitle(String title);

    public HttpStatus deleteSong(long id);

    public HttpStatus createSong(Song song);

    public HttpStatus updateSong(long id, Song songRequest);
}
