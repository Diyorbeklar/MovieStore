package com.example.uyga_vazifa_12_01_2024.Web.server;

import com.example.uyga_vazifa_12_01_2024.Web.dao.authorimpl;
import com.example.uyga_vazifa_12_01_2024.Web.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class authorserverimpl implements authorserver{
    @Autowired
    authorimpl authorimpl;
    @Override
    public List<Author> getListAuthor() {
        return authorimpl.getListAuthor();
    }

    @Override
    public Author getAuthorById(Integer id) {
        return authorimpl.getAuthorById(id);
    }

    @Override
    public void updateAuthor(Integer id, Author author) {
        authorimpl.updateAuthor(id,author);
    }

    @Override
    public void createAuthor(Author author) {
       authorimpl.createAuthor(author);
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorimpl.deleteAuthor(id);
    }
}
