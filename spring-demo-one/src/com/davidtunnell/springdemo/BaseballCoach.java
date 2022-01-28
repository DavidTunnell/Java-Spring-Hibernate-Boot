package com.davidtunnell.springdemo;

public class BaseballCoach implements Coach {
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	//the actual passing of the parameter here is done in XML (applicationContext) including the dependency of the interface
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min throwing baseballs.";
	}
	@Override
	public String getDailyFortune() {
		// use the fortuneService helper 
		return fortuneService.getFortune();
	}
}
