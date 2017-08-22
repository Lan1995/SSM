package com.ssm.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.bean.User;
import com.ssm.service.userService;

@Controller
public class UserController {
	
	@Autowired
	private userService userService;
	
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request,Model model){
		
	   int userId = Integer.parseInt(request.getParameter("id"));
	   User user = this.userService.getUserById(userId);
	   model.addAttribute("user", user);
	   return "showUser";
	}
}
