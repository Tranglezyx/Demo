package com.tr.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author trangle
 */
@ApiModel
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName(value = "tr_user")
public class User {

    @TableId
    private Long userId;

    @ApiModelProperty("用户名")
    private String userName;
    private String password;

    private Date creationDate;

    @TableField(exist = false)
    private List<Role> roleList;
}
