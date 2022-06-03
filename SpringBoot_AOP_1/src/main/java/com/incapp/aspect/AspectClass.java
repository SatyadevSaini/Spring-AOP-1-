package com.incapp.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {
	
	//advice
	
	@Before ("execution (public void eat())") // PointCut 
	public void xyz() {                       
		System.out.println("Before Eat Method ");
	}
	
	@After("execution (public void eat())")
	public void pqr(){
		System.out.println("After EAT Method");
	}

}
