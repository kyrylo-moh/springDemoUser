package com.example.demo.service;

import com.example.demo.dto.MovieDTO;
import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
@Transactional(readOnly = true)
public class MovieService {

    Logger logger = LoggerFactory.getLogger(MovieService.class);
    private MovieRepository movieRepository;
    private MovieMapper movieMapper;

    public MovieService(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    @Transactional
    public MovieDTO create(MovieDTO movieDTO) {
        Movie movie = movieMapper.map(movieDTO);
        movie = movieRepository.save(movie);
        return movieMapper.map(movie);
    }

    public List<MovieDTO> findAll() {
        return movieRepository.findAll().stream()
                .map(movieMapper::map)
                .collect(toList());
    }

    public List<MovieDTO> findWatched(boolean watched) {
        return movieRepository.findByWatched(watched).stream()
                .map(movieMapper::map)
                .collect(toList());
    }

    @Transactional
    public MovieDTO update(long id, MovieDTO movieDTO) throws ChangeSetPersister.NotFoundException {

        if (movieRepository.findById(id).isPresent()) {
            Movie movie = movieRepository.findById(id)
                    .orElseThrow(ChangeSetPersister.NotFoundException::new);
            movie.setTitle(movieDTO.getTitle());
            movie.setDescription(movieDTO.getDescription());
            movie.setWatched(movieDTO.isWatched());
            return movieMapper.map(movie);

        }
        logger.warn("Can`t update Movie" +
                movieDTO.toString());
        throw new RuntimeException("Can`t update Movie" +
                movieDTO.toString());
    }

    @Transactional
    public void delete(long id) {
        movieRepository.deleteById(id);
    }


}
