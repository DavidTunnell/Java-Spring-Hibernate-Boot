package com.davidtunnell.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		
		//check if they are the same beans
		boolean result = (theCoach == theCoach2);
		
		System.out.println("\nPointing to the same object?: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for theCoach2: " + theCoach2);

		context.close();

	}

}
 