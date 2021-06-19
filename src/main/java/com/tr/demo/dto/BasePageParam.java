package com.tr.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author trangle
 */
@Getter
@Setter
@ToString
@ApiModel("分页查询参数")
public class BasePageParam {

    @ApiModelProperty("当前页")
    private int pageNum = 1;
    @ApiModelProperty("页大小")
    private int pageSize = 10;
}
