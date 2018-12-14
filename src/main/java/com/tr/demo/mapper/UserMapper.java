package com.tr.demo.mapper;

import com.tr.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author trangle
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
