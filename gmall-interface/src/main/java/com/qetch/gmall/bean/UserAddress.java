package com.qetch.gmall.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer userId;
	private String address;
	private String username;
	private String tel;
	public UserAddress() {
		super();
	}
	public UserAddress(Integer id, Integer userId, String address, String username, String tel) {
		super();
		this.id = id;
		this.userId = userId;
		this.address = address;
		this.username = username;
		this.tel = tel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", userId=" + userId + ", address=" + address + ", username=" + username
				+ ", tel=" + tel + "]";
	}
}
