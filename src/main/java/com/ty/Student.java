package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	int id;
	String name;
	double percentage;

	public Student(@Value(value = "1") int id, @Value(value = "Karthi") String name, @Value(value = "84.3") double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public void display() {
		System.out.println("id " + id);
		System.out.println("Name " + name);
		System.out.println("Percentage " + percentage);
	}

}
