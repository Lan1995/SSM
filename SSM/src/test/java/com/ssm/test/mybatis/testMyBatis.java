package com.ssm.test.mybatis;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.ssm.bean.User;
import com.ssm.service.userService;

public class testMyBatis {
	
private static Logger logger = Logger.getLogger(testMyBatis.class);

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
	userService userService = (userService) ac.getBean("userService");
	User user = userService.getUserById(1);
	System.out.println(user.getUserName());
	logger.info("值："+user.getUserName());
	logger.info(JSON.toJSONString(user));
}

}
