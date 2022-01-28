package com.davidtunnell.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min blocking football players!";
	}

}
