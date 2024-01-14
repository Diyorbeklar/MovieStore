package com.example.uyga_vazifa_12_01_2024.Web.dao;

import com.example.uyga_vazifa_12_01_2024.Web.model.Genre;
import com.example.uyga_vazifa_12_01_2024.Web.model.Genre;

import java.util.List;

public interface genredao {
    public List<Genre> getListGenre();
    public Genre getGenreById(Integer id);
    void updateGenre(Integer id, Genre author);
    void createGenre(Genre author);
    void deleteGenre(Integer id);
}
