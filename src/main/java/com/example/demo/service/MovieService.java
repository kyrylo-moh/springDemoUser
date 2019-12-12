package com.example.demo.service;

import com.example.demo.dto.MovieDTO;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private String apiKey = "13748ed";
    private String URL = "http://www.omdbapi.com/?apikey=" + apiKey + "&t=";

    private RequestBuilder requestBuilder;
    private MovieRepository movieRepository;
    private MovieConverter movieConverter;

    public MovieService(RequestBuilder requestBuilder, MovieRepository movieRepository,
                        MovieConverter movieConverter) {
        this.requestBuilder = requestBuilder;
        this.movieRepository = movieRepository;
        this.movieConverter = movieConverter;
    }

    public MovieDTO getMovieFromOMDB(String title) {
        MovieDTO responseBody = requestBuilder.getResponseBody(URL + title);
        return responseBody;
    }

    public Movie saveMovie(MovieDTO movieDTO) {
        Movie movie = movieConverter.convertFromDTO(movieDTO);
        return movieRepository.save(movie);
    }


}
