package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    
	@Autowired
	MusicSystem musicSystem;

	public void move() {
		System.out.println("Car is Moving");

		musicSystem.play();

	}

}
