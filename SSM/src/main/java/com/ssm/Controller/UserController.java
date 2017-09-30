package com.ssm.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.bean.User;
import com.ssm.service.userService;
import com.ssm.util.Message;

@Controller
@RequestMapping("user")
public class UserController extends Message{
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private userService userService;
	
	@Autowired
	private Message message;
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request,Model model){
	   logger.info("test log4j");
	   int userId = Integer.parseInt(request.getParameter("id"));
	   User user = this.userService.getUserById(userId);
	   model.addAttribute("user", user);
	   return "ShowUser";
	}
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public Message addUser(User user){
		
		int result = userService.Insert(user);
		return message(result>0,"成功","失败");
	}
	
	@RequestMapping("/testTransactional")
	@ResponseBody
	public Message add(){
		
		List<User> list = new ArrayList<>();
		for(int i=0;i<5;i++){
			User user = new User();
			user.setUserName("小明"+i);
			user.setAge(i);
			user.setPassword(String.valueOf(i)+" "+String.valueOf(new Random(100).nextFloat()));
			list.add(user);
		}
		int result = userService.InsertUserList(list);
		return message(result>0,"成功","失败");
	}
}
