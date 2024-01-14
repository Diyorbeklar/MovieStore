package com.example.uyga_vazifa_12_01_2024.Web.dao;

import com.example.uyga_vazifa_12_01_2024.Web.mapper.authormapper;
import com.example.uyga_vazifa_12_01_2024.Web.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class authorimpl implements authordao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Author> getListAuthor() {
        return (List<Author>) jdbcTemplate.query("SELECT * FROM AUTHOR",new authormapper());
    }

    @Override
    public Author getAuthorById(Integer id) {
        return (Author) jdbcTemplate.queryForObject("SELECT * FROM AUTHOR WHERE ID=?",new Object[]{id},new authormapper());
    }

    @Override
    public void updateAuthor(Integer id, Author author) {
        jdbcTemplate.update("UPDATE AUTHOR SET id=?,first_name=?,last_name=? WHERE ID=?",author.getId(),author.getFirst_name(),author.getLast_name(),id);
    }

    @Override
    public void createAuthor(Author author) {
       jdbcTemplate.update("INSERT INTO AUTHOR(first_name,last_name) VALUES (?,?)",author.getFirst_name(),author.getLast_name());
    }

    @Override
    public void deleteAuthor(Integer id) {
       jdbcTemplate.update("DELETE FROM AUTHOR WHERE id=?",id);
    }
}
