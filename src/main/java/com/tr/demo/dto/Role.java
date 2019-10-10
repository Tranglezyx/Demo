package com.tr.demo.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author trangle
 */
@Data
@TableName(value = "tr_role")
public class Role {

    @TableId
    private Long roleId;

    private String roleName;
}
