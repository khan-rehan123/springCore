package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A b= (A)context.getBean("aref");
		System.out.println(b.getX());
		System.out.println(b.getOb().getY());
		
	}

}
