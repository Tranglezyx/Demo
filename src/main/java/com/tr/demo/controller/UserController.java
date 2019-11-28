package com.tr.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tr.demo.dto.ResultDTO;
import com.tr.demo.entity.User;
import com.tr.demo.mapper.UserMapper;
import com.tr.demo.service.IUserService;
import com.tr.demo.util.ValidationResult;
import com.tr.demo.util.ValidationUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author trangle
 */
@Api(tags = "UserController")
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping
    @ApiOperation(value = "新增用户")
    public Boolean insertUser(@RequestBody User user) {
        ValidationResult validationResult = ValidationUtils.validateEntity(user);
        if (validationResult.isHasErrors()) {
            throw new RuntimeException(validationResult.getErrorMessage());
        }
        return userService.insert(user) > 0;
    }

    @GetMapping
    @ApiOperation(value = "分页查询用户")
    public ResultDTO selectUser(User user, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userService.selectList(new QueryWrapper<User>()
                .lambda()
                .eq(user.getUserName() != null, User::getUserName, user.getUserName()));
        return ResultDTO.success(userList);
    }

    @GetMapping("/select")
    public ResultDTO select() {
        return ResultDTO.success(userMapper.selectOne(new QueryWrapper<User>()
                .lambda()
                .like(User::getUserName, "qq")));
    }

    @PostMapping("/delete-by-name")
    @ApiOperation(value = "更新用户")
    public Boolean deleteUserByName(@RequestBody User user) {
        return userMapper.update(null, new UpdateWrapper<User>()
                .lambda()
                .set(User::getPassword, user.getPassword())
                .eq(User::getUserName, user.getUserName())) > 0;
    }

    @GetMapping("/select-type-count")
    public ResultDTO selectTypeCount() {
        return ResultDTO.success(userMapper.selectTypeCount());
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

    @PostMapping("/copy")
    public Object deleteUser(@RequestBody User user) {
        User tempUser = new User();
        BeanUtils.copyProperties(user, tempUser);
        System.out.println(user.getRoleList());
        user.setUserName("www");
        user.getRoleList().get(0).setRoleName("333");
        System.out.println(tempUser.getRoleList());
        return "Success";
    }
}