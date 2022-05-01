package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");
		Coach coach = context.getBean("TrackCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
// prototype scoped beans cannot be destroyed in spring

//the spring container instantiates, configures,
//and hands it to the user such that with no further record of that prototype instance.
//they can be destroyed by using custom destroy methods in disposable bean interface