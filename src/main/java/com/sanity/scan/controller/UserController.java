package com.sanity.scan.controller;

import com.sanity.scan.model.User;
import com.sanity.scan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/users/findAll")
    List<User> findAllUsers() {
        System.out.println("findAllUsers");
        return null;
    }

}