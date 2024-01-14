package com.example.uyga_vazifa_12_01_2024.Web.dao;

import com.example.uyga_vazifa_12_01_2024.Web.mapper.moviemapper;
import com.example.uyga_vazifa_12_01_2024.Web.model.Movie;
import com.example.uyga_vazifa_12_01_2024.Web.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class movieimpl implements moviedao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Movie> getListMovie() {
        return (List<Movie>) jdbcTemplate.query("SELECT * FROM MOVIE",new moviemapper());
    }

    @Override
    public Movie getMovieById(Integer id) {
        return (Movie) jdbcTemplate.queryForObject("SELECT * FROM MOVIE WHERE ID=?",new Object[]{id},new moviemapper());
    }

    @Override
    public void updateMovie(Integer id, Movie movie) {
        jdbcTemplate.update("UPDATE MOVIE SET name=?,year=? WHERE ID=?",movie.getName(),movie.getYear(),id);
    }

    @Override
    public void createMovie(Movie movie) {
        jdbcTemplate.update("INSERT INTO MOVIE(name,genre_id,year,author_id) VALUES (?,?,?,?)",movie.getName(),movie.getGenre_id(),movie.getYear(),movie.getAuthor_id());
    }

    @Override
    public void deleteMovie(Integer id) {
        jdbcTemplate.update("DELETE FROM MOVIE WHERE id=?",id);
    }
}
