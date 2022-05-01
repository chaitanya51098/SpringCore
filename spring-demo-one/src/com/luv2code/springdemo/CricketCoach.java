package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	public CricketCoach() {
		
	}
	
	//define a private field for the dependency/constructor
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
		//theFortuneService=this.fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting exercise";
	}

	@Override
	public String getDailyFortune() {
		
		// use fortuneService(dependency) to get a fortune
		return fortuneService.getFortune();
	
	}

}
//Spring will basically construct the object myFortuneService,pass it as a dependency
// in Cricketcoach class and we accept it in our CricketCoach class and assign it 
//which is called as Dependency Injection.

//we should make our class ready to accept the dependency from spring framework
