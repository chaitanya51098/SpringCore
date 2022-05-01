package com.luv2code.springdemo;

public class Football implements Coach {

	private FortuneService fortuneService;
	
	public Football(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice kicking goals";
	}

	@Override
	public String getDailyFortune() {
		return "Football : " + fortuneService.getFortune();
	}

}
