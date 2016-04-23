package com.facade;

public class Attendance {
	private Student student;
	private double attendance = 85.6;
	public Attendance(Student aStudent){
		student=aStudent;
	}
	public void getStudentAttendance(){
		System.out.println(student.getName()+"'s attendance = "+attendance+" percentage");
	}
}
