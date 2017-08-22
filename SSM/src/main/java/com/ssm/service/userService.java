package com.ssm.service;

import com.ssm.bean.User;

public interface userService {
	
	public User getUserById(Integer id);
	
	public Integer add(User u);
}
