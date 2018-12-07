package com.qetch.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qetch.gmall.bean.UserAddress;
import com.qetch.gmall.service.OrderService;
import com.qetch.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;
	
	@Override
	public List<UserAddress> initOrder(Integer userId) {
		List<UserAddress> userAddressList = userService.listUserAddress(userId);
		for (UserAddress userAddress : userAddressList) {
			System.out.println(userAddress.getAddress());
		}
		return userAddressList;
	}
	
}
