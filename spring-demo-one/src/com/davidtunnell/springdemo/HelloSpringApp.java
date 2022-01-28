package com.davidtunnell.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container - myCoach is the id in the xml file and Coach.class is the interface
		//When we pass the interface to the method, behind the scenes Spring will cast the object for you.
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the app context
		context.close();
	}

}
