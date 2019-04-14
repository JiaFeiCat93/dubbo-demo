package com.qetch.gmall.service;

import java.util.List;

import com.qetch.gmall.bean.UserAddress;

/**
 * 用户服务
 * @ClassName: UserService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zcw
 * @date: 2019年3月29日 上午12:14:34
 */
public interface UserService {

	/**
	 * 按照用户id返回所有的收货地址
	 * @Title: listUserAddress
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param: @param userId
	 * @param: @return
	 * @return: List<UserAddress>
	 * @throws
	 */
	List<UserAddress> listUserAddress(String userId);
}
