package com.example.Project_Cinemaa.mvc.sevice;

import com.example.Project_Cinemaa.mvc.entity.Movie;
import com.example.Project_Cinemaa.mvc.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieSevice {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }
}
