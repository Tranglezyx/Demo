package com.tr.demo.util;

import lombok.Data;

import java.util.Map;

@Data
public class ValidationResult {

    //校验结果是否有错
    private boolean hasErrors;

    //校验错误信息
    private Map<String, String> errorMap;

    public boolean isHasErrors() {
        return hasErrors;
    }

    private String errorMessage;

    public String getErrorMessage() {
        return errorMap == null ? "" : errorMap.values().toString();
    }
}
