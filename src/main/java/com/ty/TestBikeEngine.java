package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBikeEngine {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
		Bike bike = (Bike) applicationContext.getBean("bike");
		bike.engine.start();
	}

}
