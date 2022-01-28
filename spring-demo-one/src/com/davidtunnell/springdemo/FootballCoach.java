package com.davidtunnell.springdemo;

public class FootballCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside FootballCoach setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside FootballCoach setTeam");
		this.team = team;
	}


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
