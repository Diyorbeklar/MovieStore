package com.example.uyga_vazifa_12_01_2024.Web.server;

import com.example.uyga_vazifa_12_01_2024.Web.model.Genre;

import java.util.List;

public interface genreserver {
    public List<Genre> getListGenre();
    public Genre getGenreById(Integer id);
    void updateGenre(Integer id, Genre author);
    void createGenre(Genre author);
    void deleteGenre(Integer id);
}
