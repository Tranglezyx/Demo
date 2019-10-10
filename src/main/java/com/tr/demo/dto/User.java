package com.tr.demo.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author trangle
 */
@ApiModel
@Data
@TableName(value = "tr_user")
public class User {

    @TableId
    private Long userId;

    @ApiModelProperty("用户名")
    private String userName;
    private String password;

    private Date creationDate;
}
