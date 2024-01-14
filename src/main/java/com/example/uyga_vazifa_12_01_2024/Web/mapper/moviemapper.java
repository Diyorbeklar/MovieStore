package com.example.uyga_vazifa_12_01_2024.Web.mapper;

import com.example.uyga_vazifa_12_01_2024.Web.model.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class moviemapper implements RowMapper<Movie> {
    @Override
    public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Movie(rs.getInt("id"),rs.getString("name"),rs.getInt("genre_id"),rs.getInt("year"),rs.getInt("author_id"));
    }
}
