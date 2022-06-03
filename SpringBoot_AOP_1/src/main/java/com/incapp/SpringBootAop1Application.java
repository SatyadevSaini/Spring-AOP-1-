package com.incapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.incapp.bean.Addition;
import com.incapp.bean.Employee;
import com.incapp.bean.Student;

@SpringBootApplication
public class SpringBootAop1Application {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(SpringBootAop1Application.class, args);
	
	Addition a = context.getBean(Addition.class); // get Addition Class Object here
	
	a.addInt(23, 23);
	a.addString("Satya", "Dharwal");
	a.sum(23, 50);
	
	Employee e = context.getBean(Employee.class); //Employe Class Object here
	
	e.eat();
	e.doJob();
	
	Student s = context.getBean(Student.class); // get object here..
	
	s.doStudy();
	s.eat();
	s.walk();
	
	
	}

}
