package com.tr.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tr.demo.dto.User;
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

    @PostMapping("/test")
    @ApiOperation(value = "新增用户")
    public Boolean insertUser(@RequestBody Map<String,Object> map) {
        return true;
    }

    @PostMapping
    @ApiOperation(value = "新增用户")
    public Boolean insertUser(@RequestBody User user) {
        return userService.insertSelective(user) > 0;
    }

    @GetMapping
    @ApiOperation(value = "分页查询用户")
    public List<User> selectUser(User user, @ApiIgnore PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
        return userService.select(user);
    }

    @PutMapping
    @ApiOperation(value = "更新用户")
    public Boolean updateUser(@RequestBody User user) {
        return userService.updateByPrimaryKeySelective(user) > 0;
    }

    @DeleteMapping
    @ApiOperation(value = "删除用户")
    public Object deleteUser(@RequestParam Long id) {
        userService.deleteByPrimaryKey(id);
        return "Success";
    }
}