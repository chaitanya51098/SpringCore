package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container(reference id,can be given interface or class name
		// and in path we give implementation class name
		Coach theCoach = context.getBean("CricketCoach", Coach.class);

		Coach theCoach1 = context.getBean("TrackCoach", Coach.class);

		Coach theCoach2 = context.getBean("FootballCoach", Coach.class);
		
		TennisCoach tenniscoach = context.getBean("TennisCoach", TennisCoach.class);


		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());

		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		
		System.out.println(tenniscoach.getDailyFortune());
		
		

		// close the context
		context.close();

	}

}
