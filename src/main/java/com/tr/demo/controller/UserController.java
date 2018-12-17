package com.tr.demo.controller;

import com.github.pagehelper.PageInfo;
import com.tr.demo.dto.User;
import com.tr.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author trangle
 */
@Api(tags = "UserController")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    @ApiOperation(value = "新增用户")
    public User insertUser(@RequestBody User user) {
        return userService.insertSelective(user);
    }

    @GetMapping
    @ApiOperation(value = "分页查询用户")
    public List<User> selectUser(User user, PageInfo pageInfo) {
        return userService.select(user, pageInfo);
    }

    @PutMapping
    @ApiOperation(value = "更新用户")
    public User updateUser(@RequestBody User user) {
        return userService.updateByPrimaryKeySelective(user);
    }

    @DeleteMapping
    @ApiOperation(value = "删除用户")
    public Object deleteUser(@RequestParam Long id) {
        userService.deleteByPrimaryKey(id);
        return "Success";
    }
}