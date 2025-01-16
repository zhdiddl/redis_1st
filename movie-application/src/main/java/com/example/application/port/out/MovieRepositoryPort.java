package com.example.application.port.out;

import com.example.domain.model.entity.Movie;
import java.util.List;
import org.springframework.data.domain.Sort;

/**
 * Represents a port for accessing movie data from a persistence layer.
 * This interface provides an abstraction that allows the application layer
 * to interact with various repository implementations
 * (e.g., databases, external APIs).
 */
public interface MovieRepositoryPort {
    List<Movie> findAll(Sort sort);
    void createMovie(Movie movie);
}