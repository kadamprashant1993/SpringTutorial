package com.org.consumer;

import com.org.service.MessageService;

public class ServiceConsumer {
	
	private MessageService service;

	
	
	//constructor-based dependency injection
//	public ServiceConsumer(MessageService svc) {
//		this.service = svc;
//	}
	
	//setter-based dependency injection
	public void setService(MessageService service) {
		
		this.service = service;
		
	}
	
	public boolean processMessage(String msg, String rec) {
		// some logic like validation, logging etc
		return this.service.sendMessage(msg, rec);
		
	}
	
}
