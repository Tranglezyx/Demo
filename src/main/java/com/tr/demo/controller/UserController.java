package com.tr.demo.controller;

import com.tr.demo.dto.User;
import com.tr.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author trangle
 */
@RestController("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public User insertUser(@RequestBody User user){
        return userService.insert(user);
    }

    @GetMapping
    public List<User> selecttUser(User user){
        return userService.select(user);
    }
}
