package com.tr.demo.dto;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import lombok.Data;

@Data
public class ResultDTO<T> {

    private T data;

    private Boolean result;

    public static <T> ResultDTO build(T data) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setData(data);
        return resultDTO;
    }

    public static <T> ResultDTO success(T data) {
        ResultDTO resultDTO = new ResultDTO();
        if(data instanceof Page){
            resultDTO.setData(new PageInfo((Page) data));
        }
        resultDTO.setResult(true);
        return resultDTO;
    }
}
