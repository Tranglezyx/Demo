package com.tr.demo.controller.req;

import com.github.pagehelper.PageInfo;
import com.tr.demo.dto.BasePageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author trangle
 */
@Setter
@Getter
@ToString
@ApiModel("用户查询对象")
public class UserParam extends BasePageParam {

    @ApiModelProperty("用户名")
    private String userName;
}

