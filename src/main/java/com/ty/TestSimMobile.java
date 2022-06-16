package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSimMobile {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
		Mobile mobile = (Mobile) applicationContext.getBean("mobile");
		mobile.sim.simName();

	}

}
