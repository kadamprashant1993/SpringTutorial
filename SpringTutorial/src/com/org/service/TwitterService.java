package com.org.service;

public class TwitterService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		
		System.out.println(msg+" send to "+rec+" using TwitterService!!");
		
		return true;
	}

}
