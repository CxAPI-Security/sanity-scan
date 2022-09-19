package com.sanity.scan.dao;

import com.sanity.scan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Repository
public class UserDao implements IUserDao {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean insertUser(User user) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        SqlParameterSource namedParameters = new MapSqlParameterSource
                ("password", user.getPassword())
                .addValue("first_name", user.getFirstName())
                .addValue("email", user.getEmail())
                .addValue("info", user.getInfo());
        int update = jdbcTemplate.update(INSERT_USER, namedParameters, keyHolder, new String[]{"id"});
        user.setId(keyHolder.getKey().longValue());
        return update > 0;
    }

    @Override
    public User getUserByEmail(String email) {
        User user = null;
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("email", email);
        try {
            user = jdbcTemplate.queryForObject(GET_USER_BY_EMAIL, params, userMapper);
        } catch (DataAccessException e) {
            //logger.error("can't find user by email", e);
        }
        return user;
    }

    @Override
    public User getUserById(long id) {
        User user = null;
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);
        try {
            user = jdbcTemplate.queryForObject(GET_USER_BY_ID, params, userMapper);
        } catch (DataAccessException e) {
            //logger.error("can't find user by id", e);
        }
        return user;
    }
}
