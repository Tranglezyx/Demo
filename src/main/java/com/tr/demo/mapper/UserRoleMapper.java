package com.tr.demo.mapper;

import com.tr.demo.dto.User;
import com.tr.demo.dto.UserRole;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author trangle
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 查询用户拥有的角色
     *
     * @param user
     * @return
     */
    List<UserRole> selectUserRole(User user);
}
