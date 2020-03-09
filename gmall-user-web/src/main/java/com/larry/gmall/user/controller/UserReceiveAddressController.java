package com.larry.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.larry.gmall.beans.UmsMemberReceiveAddress;
import com.larry.gmall.service.UserReceiveAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserReceiveAddressController {

    @Reference
    UserReceiveAddressService userReceiveAddressService;

    @RequestMapping("getUserReceiveAddressById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUserReceiveAddressById(String id){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =
                userReceiveAddressService.getUserReceiveAddressById(id);
        return umsMemberReceiveAddresses;
    }
}
