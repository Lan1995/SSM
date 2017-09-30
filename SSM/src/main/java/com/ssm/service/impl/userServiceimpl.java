package com.ssm.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.Dao.UserDao;
import com.ssm.bean.User;
import com.ssm.service.userService;

@Service("userService")
public class userServiceimpl implements userService {

	@Autowired
	private UserDao userdao;
	
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userdao.selectByPrimaryKey(id);
	}
	public Integer add(User u) {
		return userdao.insert(u);
	}
	@Override
	@Transactional
	public Integer Insert(User user) {
		// TODO Auto-generated method stub
		return userdao.insertSelective(user);
	}
	@Override
	@Transactional(rollbackFor=Exception.class)
	public Integer InsertUserList(List<User> list) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i=0;i<list.size();i++){
			if(i<2){
				int count = userdao.insertSelective(list.get(i));
				result +=count;
			}
			else{
				throw new RuntimeException();
			}
		}
		return result;
	}

}
