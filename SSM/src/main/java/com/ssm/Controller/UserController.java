package com.ssm.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.bean.User;
import com.ssm.service.userService;

@Controller
@RequestMapping("user")
public class UserController {
	
	private Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private userService userService;
	
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request,Model model){
	   logger.info("test log4j");
	   int userId = Integer.parseInt(request.getParameter("id"));
	   User user = this.userService.getUserById(userId);
	   model.addAttribute("user", user);
	   return "ShowUser";
	}
}
