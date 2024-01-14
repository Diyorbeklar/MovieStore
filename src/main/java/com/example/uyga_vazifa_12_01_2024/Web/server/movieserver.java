package com.example.uyga_vazifa_12_01_2024.Web.server;

import com.example.uyga_vazifa_12_01_2024.Web.model.Movie;

import java.util.List;

public interface movieserver {
    public List<Movie> getListMovie();
    public Movie getMovieById(Integer id);
    void updateMovie(Integer id, Movie author);
    void createMovie(Movie author);
    void deleteMovie(Integer id);
}
