package com.example.controller;

import com.example.model.Song;
import com.example.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/all")
    public Iterable<Song> getAll() {
        return songService.getAll();
    }

    @GetMapping("/view/{id}")
    public Song searchById(@PathVariable long id) {
        return songService.searchById(id);
    }

    @GetMapping("/search/{title}")
    public Iterable<Song> searchByName(@PathVariable String title) {
        return songService.searchByTitle(title);
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteSong(@PathVariable long id) {
        return songService.deleteSong(id);
    }

    @PostMapping("/create")
    public HttpStatus createSong(@RequestBody Song song) {
        return songService.createSong(song);
    }

    @PatchMapping("/update/{id}")
    public HttpStatus updateSong(@PathVariable long id, @RequestBody Song songRequest) {
        return songService.updateSong(id, songRequest);
    }

}
