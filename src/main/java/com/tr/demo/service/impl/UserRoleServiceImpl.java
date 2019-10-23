package com.tr.demo.service.impl;

import com.tr.demo.entity.User;
import com.tr.demo.entity.UserRole;
import com.tr.demo.mapper.UserRoleMapper;
import com.tr.demo.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author trangle
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserRoleServiceImpl extends BaseServiceImpl<UserRole> implements IUserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 查询用户拥有的角色
     *
     * @param user
     * @return
     */
    @Override
    public List<UserRole> selectUserRole(User user) {
        return userRoleMapper.selectUserRole(user);
    }
}
