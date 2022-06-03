package com.incapp.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {
	

	public void doStudy() {
		System.out.println("I am Student. I do study.");
	}
	public void eat() {
		System.out.println("I am Student EAT");
	}
	public void walk() {
		System.out.println("I am Student walk");
		
	}
}
