package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*
		 * Student student= new Student(); MathCheat mCheat= new MathCheat();
		 * student.setCheat(mCheat); student.cheating();
		 */
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans xml loaded");
		
		Student student= context.getBean("student", Student.class);
		student.displayStudentInfo();
		
		
	}
}
