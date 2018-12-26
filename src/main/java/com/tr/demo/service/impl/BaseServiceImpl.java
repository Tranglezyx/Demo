package com.tr.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tr.demo.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author trangle
 */
public class BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public T insert(T t) {
        baseMapper.insert(t);
        return t;
    }

    @Override
    public List<T> select(T t, PageInfo pageInfo) {
        PageHelper.startPage(pageInfo.getPageNum(), pageInfo.getPageSize());
        return baseMapper.select(t);
    }

    @Override
    public T insertSelective(T t) {
        baseMapper.insertSelective(t);
        return t;
    }

    @Override
    public T updateByPrimaryKey(T t) {
        baseMapper.updateByPrimaryKey(t);
        return t;
    }

    @Override
    public T updateByPrimaryKeySelective(T t) {
        baseMapper.updateByPrimaryKeySelective(t);
        return t;
    }

    @Override
    public void deleteByPrimaryKey(Object object) {
        baseMapper.deleteByPrimaryKey(object);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<T> selectAll() {
        return baseMapper.selectAll();
    }

    /**
     * 查询一个
     *
     * @param t
     * @return
     */
    @Override
    public T selectOne(T t) {
        return baseMapper.selectOne(t);
    }
}
