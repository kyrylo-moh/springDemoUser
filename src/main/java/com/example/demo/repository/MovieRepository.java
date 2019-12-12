package com.example.demo.repository;

import com.example.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    Movie findByTitle(String title);

    Movie findByGenre(String genre);

    List<Movie> findAllByMovieIDNotNull();
}
