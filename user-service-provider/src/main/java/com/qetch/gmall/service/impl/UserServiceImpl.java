package com.qetch.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.qetch.gmall.bean.UserAddress;
import com.qetch.gmall.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> listUserAddress(String userId) {
		UserAddress userAddress1 = new UserAddress(1, 1, "北京市海淀区上地十街辉煌国际1号楼709", "春暖花开", "18200000001");
		UserAddress userAddress2 = new UserAddress(2, 1, "北京市海淀区清河毛纺路16号院", "春暖花开", "18200000001");
		return Arrays.asList(userAddress1,userAddress2);
	}
}
