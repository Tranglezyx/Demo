package com.tr.demo.service.impl;

import com.tr.demo.dto.User;
import com.tr.demo.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author trangle
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
}
