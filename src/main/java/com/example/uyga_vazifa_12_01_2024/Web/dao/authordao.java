package com.example.uyga_vazifa_12_01_2024.Web.dao;

import com.example.uyga_vazifa_12_01_2024.Web.model.Author;

import java.util.List;

public interface authordao {
    public List<Author> getListAuthor();
    public Author getAuthorById(Integer id);
    void updateAuthor(Integer id, Author author);
    void createAuthor(Author author);
    void deleteAuthor(Integer id);
}
