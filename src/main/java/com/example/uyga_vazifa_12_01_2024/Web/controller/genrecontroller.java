package com.example.uyga_vazifa_12_01_2024.Web.controller;

import com.example.uyga_vazifa_12_01_2024.Web.model.Genre;
import com.example.uyga_vazifa_12_01_2024.Web.server.genreserverimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("genre")
public class genrecontroller {
    @Autowired
    genreserverimpl genreserverimpl;
    @GetMapping
    public List<Genre> getgenres(){
        return genreserverimpl.getListGenre();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable("id") Integer id){
        return genreserverimpl.getGenreById(id);
    }
    @PostMapping()
    public void insertGenre(@RequestBody Genre genre){
        genreserverimpl.createGenre(genre);
    }
    @DeleteMapping()
    public void deleteGenre(@RequestBody Genre genre){

        genreserverimpl.deleteGenre(genre.getId());
    }
    @PutMapping("/{id}")
    public void updateGenre(@PathVariable("id") Integer id,@RequestBody Genre genre){
        genreserverimpl.updateGenre(id,genre);
    }
}
