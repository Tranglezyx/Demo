package com.tr.demo.service.impl;

import com.tr.demo.constant.CommonConstants;
import com.tr.demo.service.IProcessService;
import org.springframework.stereotype.Service;

@Service(CommonConstants.ONE)
public class OneProcessServiceImpl implements IProcessService {

    @Override
    public void process() {
        System.out.println("One");
    }
}

