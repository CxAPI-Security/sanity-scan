package com.sanity.scan.service;

import com.sanity.scan.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IUserService {
    boolean insertUser(User user);

    User getUserByEmail(String email);

    User getUserById(long id);

    void updateUser(User user);

    void createUserCart(User user, Set<String> product_ids, List<Integer> quantities);

    void createUserMapCart(User user, Map<String, Integer> mapCart);

}