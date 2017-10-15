package com.org.service;

public class FacebookService implements MessageService {
	
	private String servicename;
	

	public String getServicename() {
		return servicename;
	}




	public void setServicename(String servicename) {
		this.servicename = servicename;
	}











	@Override
	public boolean sendMessage(String msg, String rec) {
		
		System.out.println(msg+" send to "+rec+" using "+servicename+"!!");
		
		return true;
	}

}
