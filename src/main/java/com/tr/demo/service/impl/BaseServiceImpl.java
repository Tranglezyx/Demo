package com.tr.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tr.demo.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author trangle
 */
@Service
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
}
