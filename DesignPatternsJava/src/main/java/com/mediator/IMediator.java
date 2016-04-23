package com.mediator;

public interface IMediator {
	public void giveKnowledge(String subject, int hour,int employeeCode);
	public void getKnowledge(String subject, int hour,int employeeCode);
	public void addEmployee(Employee employee);
}
