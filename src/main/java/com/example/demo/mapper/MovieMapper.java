package com.example.demo.mapper;


import com.example.demo.dto.MovieDTO;
import com.example.demo.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieDTO map(Movie movie) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(movie.getId());
        movieDTO.setTitle(movie.getTitle());
        movieDTO.setDescription(movie.getDescription());
        movieDTO.setWatched(movie.isWatched());
        return movieDTO;
    }

    public Movie map(MovieDTO movieDTO) {
        Movie movie;
        if (movieDTO.getId() != 0L) {
            movie = new Movie(movieDTO.getId());
        } else {
            movie = new Movie();
        }
        movie.setTitle(movieDTO.getTitle());
        movie.setDescription(movieDTO.getDescription());
        movie.setWatched(movieDTO.isWatched());
        return movie;
    }

}
