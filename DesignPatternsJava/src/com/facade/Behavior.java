package com.facade;

public class Behavior {
	private Student student;
	private String behavior = "Very Polite";
	public Behavior(Student aStudent){
		student=aStudent;
	}
	public void getStudentBehavior(){
		System.out.println(student.getName()+"'s behavior is "+behavior);
	}
}
