package com.larry.gmall.user.Service.impl;


import com.larry.gmall.beans.UmsMemberReceiveAddress;
import com.larry.gmall.service.UserReceiveAddressService;
import com.larry.gmall.user.mapper.UserReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserReceiveAddressServiceImpl implements UserReceiveAddressService{

    @Autowired
    UserReceiveAddressMapper userReceiveAddressMapper;


    @Override
    public List<UmsMemberReceiveAddress> getUserReceiveAddressById(String id) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo(id);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =
                userReceiveAddressMapper.selectByExample(e);
        return umsMemberReceiveAddresses;
    }
}
