package com.tr.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tr.demo.dto.User;
import com.tr.demo.mapper.UserMapper;
import com.tr.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Map;

/**
 * @author trangle
 */
@Api(tags = "UserController")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping
    @ApiOperation(value = "新增用户")
    public Boolean insertUser(@RequestBody User user) {
        return userService.insert(user) > 0;
    }

    @GetMapping
    @ApiOperation(value = "分页查询用户")
    public List<User> selectUser(User user, @ApiIgnore PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
        return userService.selectList(new QueryWrapper<User>().lambda()
                .eq(user.getUserName() != null, User::getUserName, user.getUserName()));
    }

    @GetMapping("/select")
    @ApiOperation(value = "分页查询用户")
    public List<User> select() {
        return userMapper.selectUser();
    }

    @PutMapping
    @ApiOperation(value = "更新用户")
    public Boolean updateUser(@RequestBody User user) {
        return userService.updateById(user) > 0;
    }

    @DeleteMapping
    @ApiOperation(value = "删除用户")
    public Object deleteUser(@RequestParam Long id) {
        userService.deleteById(id);
        return "Success";
    }
}