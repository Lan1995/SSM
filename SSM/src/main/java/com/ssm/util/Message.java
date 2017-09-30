package com.ssm.util;

import org.springframework.stereotype.Component;

@Component
public class Message {
	
	private String code;
	private String message;
	private boolean result;
	
	
	
	public Message() {
		super();
	}
	
	public Message message(boolean result,String message1,String message2){
		String message = result ?  message1 :  message2;
		return new Message(result,message);
	}

	public Message(boolean result,String message){
		this.message = message;
		this.result = result;
	}
	
	public Message(String code, String message, boolean result) {
		super();
		this.code = code;
		this.message = message;
		this.result = result;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
		
}
