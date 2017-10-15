package com.org.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.consumer.ServiceConsumer;

public class MyApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"AppContext.xml");
		ServiceConsumer twapp = (ServiceConsumer) context.getBean("TwApp");

		twapp.processMessage("Hi ", "prashant@abc.com");
		
		ServiceConsumer fbapp = (ServiceConsumer) context.getBean("FbApp");
		
		fbapp.processMessage("Hi", "prashant@abc.com");
		// close the context
		context.close();

	}

}
