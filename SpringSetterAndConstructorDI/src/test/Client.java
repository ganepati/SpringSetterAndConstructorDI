package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;
import beans.Test;

public class Client {
	public static void main(String[] args) {
		String[] files=new String[] {"resource/Spring.xml"}; 
		ApplicationContext ap=new ClassPathXmlApplicationContext(files);
		Test t=(Test)ap.getBean("t");
		t.printUserInfo();
		
		Car c=(Car)ap.getBean("c");
		c.printData();
	}

}
