package com.springcore.stereoType.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/stereoType/anotation/stereoConfig.xml");
	Student bean = context.getBean("student",Student.class);
	Student bean1 = context.getBean("student",Student.class);
	/*
	 * System.out.println(bean); System.out.println(bean.getAddress());
	 * System.out.println(bean.getAddress().getClass().getName());
	 */
	System.out.println(bean.hashCode());
	System.out.println(bean1.hashCode());
	}
}
