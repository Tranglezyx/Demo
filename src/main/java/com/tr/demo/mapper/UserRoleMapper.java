package com.tr.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tr.demo.dto.User;
import com.tr.demo.dto.UserRole;
import org.apache.ibatis.annotations.Mapper;

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
