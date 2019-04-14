package com.qetch.gmall.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qetch.gmall.bean.UserAddress;
import com.qetch.gmall.service.OrderService;
import com.qetch.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	@Reference
	UserService userService;
	
	@Override
	public List<UserAddress> initOrder(String userId) {
		List<UserAddress> userAddressList = userService.listUserAddress(userId);
		for (UserAddress userAddress : userAddressList) {
			System.out.println(userAddress.getAddress());
		}
		return userAddressList;
	}
	
}
