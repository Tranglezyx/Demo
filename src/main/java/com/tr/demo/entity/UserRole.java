package com.tr.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * @author trangle
 */
@Data
@TableName(value = "tr_user_role")
public class UserRole {

    private Long userId;
    private Long roleId;

    private String roleName;
    private String userName;
}
