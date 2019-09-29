package com.tr.demo.service;

import java.util.List;

/**
 * @author trangle
 */
public interface IBaseService<T> {

    /**
     * 根据主键删除
     *
     * @param o
     * @return
     */
    int deleteByPrimaryKey(Object o);

    /**
     * 根据字段数据删除
     *
     * @param t
     * @return
     */
    int delete(T t);

    /**
     * 新增
     *
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 新增
     * 只新增对象中字段不为null的数据
     *
     * @param t
     * @return
     */
    int insertSelective(T t);

    /**
     * 判断是否存在
     *
     * @param o
     * @return
     */
    boolean existsWithPrimaryKey(Object o);

    /**
     * 查询所有数据
     *
     * @return
     */
    List<T> selectAll();

    /**
     * 根据主键查询
     *
     * @param o
     * @return
     */
    T selectByPrimaryKey(Object o);

    /**
     * 查询数据量
     *
     * @param t
     * @return
     */
    int selectCount(T t);

    /**
     * 查询数据
     *
     * @param t
     * @return
     */
    List<T> select(T t);

    /**
     * 根据条件只查询一个，如果查询结果为多个会报错
     *
     * @param t
     * @return
     */
    T selectOne(T t);

    /**
     * 根据主键更新
     *
     * @param t
     * @return
     */
    int updateByPrimaryKey(T t);

    /**
     * 根据主键更新当前对象字段不为null的数据
     *
     * @param t
     * @return
     */
    int updateByPrimaryKeySelective(T t);
}
