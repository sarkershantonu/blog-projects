package com.facade;

public class Program {
	public static void main(String[] args) {
		Student aSudent = new Student();
		ReportCardFacade studentReport = new ReportCardFacade(aSudent);
		studentReport.getResultCard();		
	}
}
