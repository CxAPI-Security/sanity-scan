package com.sanity.scan.dao;

import com.sanity.scan.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int row) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setPassword(rs.getString("password"));
        user.setFirstName(rs.getString("first_name"));
        user.setEmail(rs.getString("email"));
        user.setInfo(rs.getString("info"));
        return user;
    }

    public User mapRow(ResultSet rs) throws SQLException {
        return this.mapRow(rs, 0);
    }

}