package com.tr.demo.service;

import com.github.pagehelper.PageInfo;
import com.tr.demo.dto.User;

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
     * @param pageInfo
     * @return
     */
    List<T> select(T t, PageInfo pageInfo);

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

    /**
     * 查询所有
     *
     * @return
     */
    List<T> selectAll();

    /**
     * 查询一个
     *
     * @param t
     * @return
     */
    T selectOne(T t);
}
