package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	public TrackCoach() {
		
	}
	
	private FortuneService fortuneService;
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k metres daily";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach : " + fortuneService.getFortune();
	}
	
	//add a init method - executed after initialising a bean or object
	public void doMyStartupStuff() {
		System.out.println("after bean started");
	}
	
	
	//add a destroy method - executed after destroying a bean like context.close
	public void doMyCleanupStuff() {
		System.out.println("after closing bean");
	}

}
