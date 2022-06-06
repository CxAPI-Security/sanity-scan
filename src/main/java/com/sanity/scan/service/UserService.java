package com.sanity.scan.service;

import com.sanity.scan.dao.IUserDao;
import com.sanity.scan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public boolean insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        //TODO implement
    }

}
