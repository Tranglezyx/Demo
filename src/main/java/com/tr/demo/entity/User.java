package com.tr.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
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
    @Length(min = 5,max = 20,message = "名字必须5-20个字符")
    private String userName;

    @Pattern(regexp="(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{5,10}",message="密码必须是5~10位数字和字母的组合")
    private String password;

    private Date creationDate;

    @TableField(exist = false)
    private List<Role> roleList;
}
