package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		Coach coach = context.getBean("TrackCoach", Coach.class);
		Coach alphacoach = context.getBean("TrackCoach", Coach.class);
		boolean result = (coach==alphacoach);
		System.out.println("Both are pointing to same bean :" + result);
		System.out.println("Memory location of coach : "+coach);
		System.out.println("Memory location of alphacoach : "+alphacoach);
		context.close();
	}

}
//here by default scope of bean is singleton
//so, both the references are pointing to one single object created
//for the same class
//when scope of bean is prototype
//so, both the references are pointing to different objects created 
//for each request for the same class