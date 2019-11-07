package com.example.repository;

import com.example.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SongRepository  extends CrudRepository<Song, Long> {
    public List<Song> findByTitle(String title);
}
