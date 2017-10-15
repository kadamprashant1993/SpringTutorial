package com.org.service;

public class FacebookService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		
		System.out.println(msg+" send to "+rec+" using FacebookService!!");
		
		return true;
	}

}
