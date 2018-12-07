package com.qetch.gmall.service;

import java.util.List;

import com.qetch.gmall.bean.UserAddress;

public interface OrderService {
	
	List<UserAddress> initOrder(Integer userId);
}
