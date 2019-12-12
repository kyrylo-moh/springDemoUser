package com.example.demo.controller;

import com.example.demo.dto.MovieDTO;
import com.example.demo.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movieApi")
public class MovieController {

    Logger logger = LoggerFactory.getLogger(MovieController.class);

    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/getMovie")
    public MovieDTO getMovie(@RequestParam(name = "title") String title) {
    //public MovieDTO getMovie(String title) {

        logger.info("we GET movie from other api OMDB");
        return movieService.getMovieFromOMDB(title);
    }
}
