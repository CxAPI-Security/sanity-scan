package com.sanity.scan.service;

import com.sanity.scan.model.User;

import java.util.List;
import java.util.Set;

public interface IUserService {
    boolean insertUser(User user);

    User getUserByEmail(String email);

    User getUserById(long id);

    void updateUser(User user);

    void createUserCart(User user, Set<String> product_ids, List<Integer> quantities);
}
