package com.tr.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tr.demo.entity.User;

import java.util.List;

/**
 * @author trangle
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectUser();
}
