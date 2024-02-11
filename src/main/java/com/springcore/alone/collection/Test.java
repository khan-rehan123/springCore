package com.springcore.alone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	ApplicationContext contex=	new ClassPathXmlApplicationContext("com/springcore/alone/collection/config.xml");
	Person pe= contex.getBean("friendsList", Person.class);
	System.out.println(pe.getFriends().getClass().getName());
	
	System.out.println("______________________");
	
	System.out.println(pe.getFessStructure());
	}
}
