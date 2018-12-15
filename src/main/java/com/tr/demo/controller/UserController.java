package com.tr.demo.controller;

import com.github.pagehelper.PageInfo;
import com.tr.demo.dto.User;
import com.tr.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author trangle
 */
@RestController("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public User insertUser(@RequestBody User user) {
        return userService.insertSelective(user);
    }

    @GetMapping
    public List<User> selectUser(User user, PageInfo pageInfo) {
        return userService.select(user, pageInfo);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateByPrimaryKeySelective(user);
    }

    @DeleteMapping
    public Object deleteUser(@RequestParam Long id) {
        userService.deleteByPrimaryKey(id);
        return "Success";
    }
}
