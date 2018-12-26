package com.tr.demo.dto;

import javax.persistence.Table;

/**
 * @author trangle
 */
@Table(name = "tr_user_role")
public class UserRole {

    private Long userId;
    private Long roleId;

    private String roleName;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public UserRole setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getRoleId() {
        return roleId;
    }

    public UserRole setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public UserRole setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserRole setUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
