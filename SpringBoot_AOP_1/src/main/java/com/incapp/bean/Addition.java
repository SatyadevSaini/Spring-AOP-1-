package com.incapp.bean;

import org.springframework.stereotype.Component;

@Component
public class Addition {
	
	public void addInt(int x , int y) {
		System.out.println("sum :" +(x+y));
	}
	
	
	public void addString(String x , String y) {
		System.out.println("Concat : " +(x+y));
	}
	
	public int sum(int x , int y) {
		System.out.println("Doing sum");
		return x+y;
	}
}
