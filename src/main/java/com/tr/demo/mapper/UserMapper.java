package com.tr.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tr.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author trangle
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectUser();
}
