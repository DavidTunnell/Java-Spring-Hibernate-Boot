package com.davidtunnell.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	//define constructor for dependency injection
	//the actual passing of the parameter here is done in XML (applicationContext) including the dependency of the interface
	public TrackCoach (FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min running!!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	//add an init hook
	public void doMyStartupStuff() {
		System.out.println("doMyStartupStuff hook run");
	}
	
	//destroy end of life cycle hook
	public void doMyCleanupStuff() {
		System.out.println("doMyCleanupStuff hook run");
	}
}
