package com.example.uyga_vazifa_12_01_2024.Web.server;

import com.example.uyga_vazifa_12_01_2024.Web.dao.movieimpl;
import com.example.uyga_vazifa_12_01_2024.Web.model.Movie;
import com.example.uyga_vazifa_12_01_2024.Web.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class movieserverimpl implements movieserver{
    @Autowired
    movieimpl movieimpl;
    @Override
    public List<Movie> getListMovie() {

        return  movieimpl.getListMovie() ;
    }

    @Override
    public Movie getMovieById(Integer id) {
        return movieimpl.getMovieById(id);
    }

    @Override
    public void updateMovie(Integer id, Movie movie) {
        movieimpl.updateMovie(id,movie);
    }

    @Override
    public void createMovie(Movie movie) {
        movieimpl.createMovie(movie);
    }

    @Override
    public void deleteMovie(Integer id) {
        movieimpl.deleteMovie(id);
    }
}
