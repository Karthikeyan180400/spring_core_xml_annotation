package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarMusicSystem {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
		Car car = (Car) applicationContext.getBean("car");
		car.move();
	}

}
