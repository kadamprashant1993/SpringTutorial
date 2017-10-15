package com.org.job;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.org.consumer.ServiceConsumer;

public class MyApplication {

	public static void main(String[] args) {
		
		//This is Big Brother of BeanFactory with addition support like AOP and Event Notification,etc.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
		
		
		//For this it will load from root location
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("AppContext.xml"));
		
		ServiceConsumer twapp = (ServiceConsumer) context.getBean("TwApp");
		twapp.processMessage("Hi ", "prashant@abc.com");
		//ServiceConsumer twapp = (ServiceConsumer) factory.getBean("TwApp");
		//twapp.processMessage("Hi ", "prashant@abc.com");
		
		ServiceConsumer fbapp = (ServiceConsumer) context.getBean("FbApp");
		
		fbapp.processMessage("Hi", "prashant@abc.com");
		
		//ServiceConsumer fbapp = (ServiceConsumer) factory.getBean("FbApp");
		
		//fbapp.processMessage("Hi", "prashant@abc.com");
		// close the context
		context.close();
		

	}

}
