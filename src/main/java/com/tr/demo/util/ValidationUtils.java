package com.tr.demo.util;


import org.apache.commons.collections4.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidationUtils {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * 校验实体类
     *
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> ValidationResult validateEntity(T obj) {
        ValidationResult result = new ValidationResult();

        Set<ConstraintViolation<T>> set = validator.validate(obj, Default.class);
        if (CollectionUtils.isNotEmpty(set)) {
            result.setHasErrors(true);
            Map<String, String> errorMsg = new HashMap<String, String>();
            for (ConstraintViolation<T> cv : set) {
                errorMsg.put(cv.getPropertyPath().toString(), cv.getMessage());
            }
            result.setErrorMap(errorMsg);
        }
        return result;
    }

    /**
     * 仅校验具体某个字段
     *
     * @param obj
     * @param propertyName
     * @param <T>
     * @return
     */
    public static <T> ValidationResult validateProperty(T obj, String propertyName) {
        ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<T>> set = validator.validateProperty(obj, propertyName, Default.class);
        if (CollectionUtils.isNotEmpty(set)) {
            result.setHasErrors(true);
            Map<String, String> errorMsg = new HashMap<String, String>();
            for (ConstraintViolation<T> cv : set) {
                errorMsg.put(propertyName, cv.getMessage());
            }
            result.setErrorMap(errorMsg);
        }
        return result;
    }
}
