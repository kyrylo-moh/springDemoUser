package com.example.demo.service;

import com.example.demo.dto.MovieDTO;
import com.example.demo.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private String apiKey = "13748ed";
    private String URL = "http://www.omdbapi.com/?" + apiKey + "&t=";

    private RequestBuilder requestBuilder;
    private MovieRepository movieRepository;

    public MovieService(RequestBuilder requestBuilder, MovieRepository movieRepository) {
        this.requestBuilder = requestBuilder;
        this.movieRepository = movieRepository;
    }

    private MovieDTO getMovieFromOMDB(String title) {
        MovieDTO responseBody = requestBuilder.getResponseBody(URL + title);
        return responseBody;

    }


}
