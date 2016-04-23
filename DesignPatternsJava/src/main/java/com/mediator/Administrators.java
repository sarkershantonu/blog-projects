package com.mediator;

public class Administrators extends Employee{
	public Administrators(IMediator aMeadiator) {
		super(aMeadiator);
		System.out.println("Administrators have signed up for schooling \n");
	}
}
