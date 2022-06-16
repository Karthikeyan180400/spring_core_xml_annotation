package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	int id;
	String name;
	String mail;

	@Value(value = "100")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "Karthi")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "karthi@mail.com")
	public void setMail(String mail) {
		this.mail = mail;
	}

	public void display() {
		System.out.println("Id " + id);
		System.out.println("Name " + name);
		System.out.println("Email " + mail);

	}

}
