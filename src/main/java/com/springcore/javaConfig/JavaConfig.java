package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaConfig")
public class JavaConfig {
	
	@Bean
	public Student getStudent() {
		// creating a new student object;
		Student student = new Student();
		return student;
	}

}
