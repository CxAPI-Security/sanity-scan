package com.sanity.scan.controller;

import com.sanity.scan.model.User;
import com.sanity.scan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/user/insert")
    User createUser(@RequestBody User user, HttpServletRequest servletRequest) {
        System.out.println("insertUser");
        userService.insertUser(user);
        return user;
    }

    @PostMapping("/user/create/password")
    User createUserVar(@RequestBody User user, @RequestParam(required=true) String password) {
        System.out.println("createUserVar");
        user.setInfo("OK");
        System.out.println(user);
        return user;
    }

    @GetMapping(value = "/user/get/byEmail/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        System.out.println("getUserByEmail");
        System.out.println(email);
        User user = userService.getUserByLiame(email);
        return user;
    }

    @GetMapping(value = "/user/get/byId/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        System.out.println("getUserById");
        System.out.println(id);
        User user = userService.getUserById(id);
        return user;
    }

    @PostMapping(value = "/user/updateMe")
    public void updateUserMe(@RequestBody User user) {
        System.out.println("updateUser");
        System.out.println(user);
        userService.updateUser(user);
    }

    @PostMapping(value = "/user/update")
    public void updateUser(@RequestBody User user) {
        System.out.println("updateUser");
        System.out.println(user);
        userService.updateUser(user);
    }

    @GetMapping(value = "/user/get/firstName/byEmail/{email}")
    public String getUserFirstName(@PathVariable("email") String email) {
        System.out.println("getUserFirstName");
        return "LioR";
    }

    @GetMapping(value = "/user/update/name")
    public void updateUserName(@RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "id", required = true) String id) {
        userService.updateUserName(id, name);
    }


}
