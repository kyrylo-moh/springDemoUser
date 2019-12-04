package com.example.demo.controller;

import com.example.demo.dto.MovieDTO;
import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    MovieDTO create(@Valid @RequestBody MovieDTO movieDTO) {
        return movieService.create(movieDTO);
    }

    @PutMapping("/{id}")
    MovieDTO update(@PathVariable("id") long id, @Valid @RequestBody MovieDTO movieDTO) throws ChangeSetPersister.NotFoundException {
        return movieService.update(id, movieDTO);
    }

    @GetMapping
    List<MovieDTO> findAll() {
        return movieService.findAll();
    }

    @GetMapping(params = "watched")
    List<MovieDTO> findAll(@RequestParam("watched") boolean watched) {
        return movieService.findWatched(watched);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") long id) {
        movieService.delete(id);
    }
}
