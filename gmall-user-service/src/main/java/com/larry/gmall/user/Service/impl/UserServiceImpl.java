package com.larry.gmall.user.Service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.larry.gmall.beans.UmsMember;
import com.larry.gmall.service.UserService;
import com.larry.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }
}
