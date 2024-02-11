package com.springcore.spEl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/spEl/spelconfig.xml");
		Demo1 d1 = context.getBean("demo1",Demo1.class);
		System.out.println(d1);
	}

}
