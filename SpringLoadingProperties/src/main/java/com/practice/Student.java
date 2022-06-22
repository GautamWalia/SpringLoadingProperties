package com.practice;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value(value = "${student.name}")
	private String name;
	private String interestedCoure;
	private String hobby;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.print("setter method called");
	}
	public String getInterestedCoure() {
		return interestedCoure;
	}
	
	@Required
	@Value("${student.interestedcourse}")
	public void setInterestedCoure(String interestedCoure) {
		this.interestedCoure = interestedCoure;
	}
	public String getHobby() {
		return hobby;
	}
	@Value(value = "${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is: "+ name);
		System.out.println("interested course is: "+ interestedCoure);
		System.out.println("hobby is: "+ hobby);
	}
}
