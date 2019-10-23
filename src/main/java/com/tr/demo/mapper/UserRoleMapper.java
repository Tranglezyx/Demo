package com.tr.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tr.demo.entity.User;
import com.tr.demo.entity.UserRole;

import java.util.List;

/**
 * @author trangle
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 查询用户拥有的角色
     *
     * @param user
     * @return
     */
    List<UserRole> selectUserRole(User user);
}
