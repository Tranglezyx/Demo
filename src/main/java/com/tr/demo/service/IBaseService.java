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
}
