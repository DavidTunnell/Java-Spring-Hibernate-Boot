package com.davidtunnell.springdemo;

public class FootballCoach implements Coach {
	
	public FootballCoach() {
		System.out.println("Inside FootballCoach no arg constructor");
	}
	
	
	//setter method that spring will call when injecting dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside FootballCoach FortuneService setter method - setFortuneService()");
		this.fortuneService = fortuneService;
	}

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min blocking football players!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
