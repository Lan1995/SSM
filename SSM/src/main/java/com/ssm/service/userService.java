package com.ssm.service;

import java.util.List;

import com.ssm.bean.User;

public interface userService {
	
	public User getUserById(Integer id);
	
	public Integer add(User uer);
	
	public Integer Insert(User user);
	
	public Integer InsertUserList(List<User> list);
}
