package com.tr.demo.service.impl;

import com.tr.demo.entity.Role;
import com.tr.demo.service.IRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author trangle
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl extends BaseServiceImpl<Role> implements IRoleService {


}
