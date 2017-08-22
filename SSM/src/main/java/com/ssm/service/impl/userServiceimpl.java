package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.Dao.UserDao;
import com.ssm.bean.User;
import com.ssm.service.userService;

@Service("userService")
public class userServiceimpl implements userService {

	@Autowired
	private UserDao usermapper;
	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return usermapper.selectByPrimaryKey(id);
	}
	@Override
	public Integer add(User u) {
		return usermapper.insert(u);
	}

}
