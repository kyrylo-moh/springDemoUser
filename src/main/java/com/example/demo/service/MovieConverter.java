package com.example.demo.service;

import com.example.demo.dto.MovieDTO;
import com.example.demo.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieConverter {

    public MovieConverter() {
    }

    private Movie convertFromDTO(MovieDTO movieDTO) {
        return new Movie(
                movieDTO.getTitle(),
                movieDTO.getYear(),
                movieDTO.getRated(),
                movieDTO.getReleased(),
                movieDTO.getRuntime(),
                movieDTO.getGenre(),
                movieDTO.getDirector(),
                movieDTO.getWriter(),
                movieDTO.getActors(),
                movieDTO.getPlot(),
                movieDTO.getLanguage(),
                movieDTO.getCountry(),
                movieDTO.getAwards(),
                movieDTO.getPoster(),

                movieDTO.getMetaScore(),
                movieDTO.getImdbRating(),
                movieDTO.getImdbVotes(),
                movieDTO.getImdbID(),
                movieDTO.getType(),
                movieDTO.getDvd(),
                movieDTO.getBoxOffice(),
                movieDTO.getProduction(),
                movieDTO.getWebsite(),
                movieDTO.getResponse()
        );
    }

}
