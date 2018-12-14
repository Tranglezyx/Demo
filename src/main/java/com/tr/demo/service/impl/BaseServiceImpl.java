package com.tr.demo.service.impl;

import com.tr.demo.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * @author trangle
 */
@Service
public class  BaseServiceImpl<T> implements IBaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public T insert(T t) {
        baseMapper.insert(t);
        return t;
    }

    @Override
    public List<T> select(T t) {
        return baseMapper.select(t);
    }
}
