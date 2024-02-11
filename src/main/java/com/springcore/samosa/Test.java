package com.springcore.samosa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/samosa/samosaConfig.xml");
		Samosa sa=(Samosa) context.getBean("sa");
		System.out.println(sa);
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		Pepsi p1=(Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		
		System.out.println("----------------------------------");
		Example ex=(Example) context.getBean("ex");
		System.out.println(ex);
		}
}
