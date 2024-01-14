package com.example.uyga_vazifa_12_01_2024.Web.controller;

import com.example.uyga_vazifa_12_01_2024.Web.model.Movie;
import com.example.uyga_vazifa_12_01_2024.Web.server.movieserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class movieconroller {
    @Autowired
    movieserverimpl movieserverimpl;
    @GetMapping
    public List<Movie> getmovies(){

        return movieserverimpl.getListMovie();
    }
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable("id") Integer id){
        return movieserverimpl.getMovieById(id);
    }
    @PostMapping()
    public void insertMovie(@RequestBody Movie movie){
        movieserverimpl.createMovie(movie);
    }
    @DeleteMapping()
    public void deleteMovie(@RequestBody Movie movie){

        movieserverimpl.deleteMovie(movie.getId());
    }
    @PutMapping("/{id}")
    public void updateMovie(@PathVariable("id") Integer id,@RequestBody Movie movie){
        movieserverimpl.updateMovie(id,movie);
    }
}
