package com.example.uyga_vazifa_12_01_2024.Web.dao;

import com.example.uyga_vazifa_12_01_2024.Web.mapper.genremapper;
import com.example.uyga_vazifa_12_01_2024.Web.model.Genre;
import com.example.uyga_vazifa_12_01_2024.Web.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class genreimpl implements genredao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Genre> getListGenre() {
        return (List<Genre>) jdbcTemplate.query("SELECT * FROM GENRE",new genremapper());
    }

    @Override
    public Genre getGenreById(Integer id) {
        return (Genre) jdbcTemplate.queryForObject("SELECT * FROM GENRE WHERE ID=?",new Object[]{id},new genremapper());
    }

    @Override
    public void updateGenre(Integer id, Genre genre) {
        jdbcTemplate.update("UPDATE GENRE SET name=? WHERE ID=?",genre.getName(),id);
    }

    @Override
    public void createGenre(Genre genre) {
        jdbcTemplate.update("INSERT INTO GENRE(name) VALUES (?)",genre.getName());
    }

    @Override
    public void deleteGenre(Integer id) {
        jdbcTemplate.update("DELETE FROM GENRE WHERE id=?",id);
    }
}
