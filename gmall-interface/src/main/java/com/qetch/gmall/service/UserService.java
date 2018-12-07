package com.qetch.gmall.service;

import java.util.List;

import com.qetch.gmall.bean.UserAddress;

public interface UserService {

	List<UserAddress> listUserAddress(Integer userId);
}
