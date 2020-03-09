package com.larry.gmall.service;

import com.larry.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

public interface UserReceiveAddressService{

    List<UmsMemberReceiveAddress> getUserReceiveAddressById(String id);
}
