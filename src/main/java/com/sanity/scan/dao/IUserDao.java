package com.sanity.scan.dao;

import com.sanity.scan.model.User;

import java.util.List;

public interface IUserDao {

    public static final String GET_USER_BY_EMAIL =
            " SELECT " +
                    "	u.* " +
                    " FROM " +
                    "	users u " +
                    " WHERE " +
                    "	upper(u.email) = upper(:email) ";

    public static final String GET_USER_BY_ID =
            " SELECT " +
                    "	u.* " +
                    " FROM " +
                    "	users u " +
                    " WHERE " +
                    "	u.id = :id ";

    public static final String INSERT_USER =
            "INSERT INTO " +
                    "	users " +
                    "	( " +
                    "		password " +
                    "		,first_name " +
                    "		,email " +
                    "		,info " +
                    "	) " +
                    "VALUES " +
                    "	(	" +
                    "		:password " +
                    "		,:first_name " +
                    "		,:email " +
                    "		,:info " +
                    "	)	";

    public static final String FIND_ALL_USERS =
            " SELECT " +
            "	u.* " +
            " FROM " +
            "	users u ";

    boolean insertUser(User user);

    User getUserByEmail(String email);

    User getUserById(long id);

    List<User> findAllUsers();
}
