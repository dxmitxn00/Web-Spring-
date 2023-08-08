package Assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
				
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		TV ss = (TV)factory.getBean("samsung");
		ss.onOff();
		ss.volDown();
		ss.chDown();
		ss.chUp();
		ss.volUp();
		
		System.out.println("\n");
		
		TV lg = (TV)factory.getBean("lg");
		lg.onOff();
		lg.volUp();
		lg.chUp();
		lg.volDown();
		lg.chDown();
		
		factory.close();
	}
}
