package com.davidtunnell.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
	
	String[] random = {"1", "2", "3"};
	
	@Override
	public String getFortune() {		
		return random[new Random().nextInt(random.length)];
	};
}
