package com.example.uyga_vazifa_12_01_2024.Web.mapper;

import com.example.uyga_vazifa_12_01_2024.Web.model.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class authormapper implements RowMapper<Author> {
    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Author(rs.getInt("id"),rs.getString("first_name"), rs.getString("last_name"));
    }
}
