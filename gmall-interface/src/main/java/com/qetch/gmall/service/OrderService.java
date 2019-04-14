package com.qetch.gmall.service;

import java.util.List;

import com.qetch.gmall.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @Title: initOrder
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param: @param userId
	 * @param: @return
	 * @return: List<UserAddress>
	 * @throws
	 */
	List<UserAddress> initOrder(String userId);
}
