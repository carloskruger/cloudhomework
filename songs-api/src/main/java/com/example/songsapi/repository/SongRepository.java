package com.example.songsapi.repository;

import com.example.songsapi.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SongRepository  extends CrudRepository<Song, Long> {
    public List<Song> findByTitle(String title);
}
