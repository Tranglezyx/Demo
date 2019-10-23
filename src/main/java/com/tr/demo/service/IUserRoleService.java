package com.tr.demo.service;

import com.tr.demo.entity.User;
import com.tr.demo.entity.UserRole;

import java.util.List;

/**
 * @author trangle
 */
public interface IUserRoleService extends IBaseService<UserRole> {

    /**
     * 查询用户拥有的角色
     *
     * @param user
     * @return
     */
    List<UserRole> selectUserRole(User user);
}
