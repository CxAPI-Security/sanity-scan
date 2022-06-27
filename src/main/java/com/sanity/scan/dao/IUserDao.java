package com.sanity.scan.dao;

import com.sanity.scan.model.User;

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
                    "		,liame " +
                    "		,info " +
                    "	) " +
                    "VALUES " +
                    "	(	" +
                    "		:password " +
                    "		,:liame " +
                    "		,:info " +
                    "	)	";
    boolean insertUser(User user);

    User getUserByLiame(String liame);

    User getUserById(long id);

    void updateUserName(String id, String name);
}
