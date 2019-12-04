package com.example.demo.repository;

import com.example.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findById(long id);

    List<Movie> findByWatched(boolean watched);

    List<Movie> getAllByIdIsNotNull();

}
