package com.qetch.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.qetch.gmall.bean.UserAddress;
import com.qetch.gmall.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> listUserAddress(Integer userId) {
		UserAddress userAddress1 = new UserAddress(1, 1, "�����к������ϵ�ʮ�ֻԻ͹���1��¥709", "��ů����", "18200000001");
		UserAddress userAddress2 = new UserAddress(2, 1, "�����к��������ë��·16��Ժ", "��ů����", "18200000001");
		return Arrays.asList(userAddress1,userAddress2);
	}
}
