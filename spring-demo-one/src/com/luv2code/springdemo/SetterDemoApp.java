package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container(give id,class) as in xml
		TennisCoach tennisCoach=context.getBean("TennisCoach",TennisCoach.class);
		//call methods on bean
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getPlayer());
		System.out.println(tennisCoach.getCountry());
		//close the context
		context.close();
		
	}

}
