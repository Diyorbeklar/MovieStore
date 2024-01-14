package com.example.uyga_vazifa_12_01_2024.Web.mapper;

import com.example.uyga_vazifa_12_01_2024.Web.model.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class genremapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Genre(rs.getInt("id"),rs.getString("name"));
    }
}
