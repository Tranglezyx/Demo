package com.tr.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tr.demo.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author trangle
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectUser();

    List<Map<String,Integer>> selectTypeCount();
}
