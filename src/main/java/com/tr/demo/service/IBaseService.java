package com.tr.demo.service;

import java.util.List;

/**
 * @author trangle
 */
public interface IBaseService<T> {

    /**
     * 通用insert
     *
     * @param t
     * @return
     */
    T insert(T t);

    /**
     * 通用查询
     *
     * @param t
     * @return
     */
    List<T> select(T t);

    /**
     * 通用insert
     *
     * @param t
     * @return
     */
    T insertSelective(T t);

    /**
     * 通用update
     *
     * @param t
     * @return
     */
    T updateByPrimaryKey(T t);

    /**
     * 通用update
     *
     * @param t
     * @return
     */
    T updateByPrimaryKeySelective(T t);

    /**
     * 删除
     *
     * @param object
     */
    void deleteByPrimaryKey(Object object);
}
