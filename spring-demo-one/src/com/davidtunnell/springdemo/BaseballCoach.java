package com.davidtunnell.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min throwing baseballs.";
	}
}
