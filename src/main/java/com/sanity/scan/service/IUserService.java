package com.sanity.scan.service;

import com.sanity.scan.model.User;

public interface IUserService {
    boolean insertUser(User user);

    User getUserByLiame(String email);

    User getUserById(long id);

    void updateUser(User user);

    void updateUserName(String id, String name);
}
