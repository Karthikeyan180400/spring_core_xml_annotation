package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value = "100")
	int id;
	@Value(value = "Karthikeyan")
	String name;
	@Value(value = "25000")
	double salary;

	public void display() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
	}

}
