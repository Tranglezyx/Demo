package com.tr.demo.mapper;

import com.tr.demo.dto.Role;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * @author trangle
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {
}
