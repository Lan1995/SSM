package com.ssm.util;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class GetRequestParameter {
	
	private  Logger logger = Logger.getLogger(this.getClass());
	
	public void Getparameter(HttpServletRequest request){
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			logger.info("Parameter Name:"+names.nextElement());
			logger.info("Parameter Name:"+request.getParameter(names.nextElement()));
		}
	}
}
