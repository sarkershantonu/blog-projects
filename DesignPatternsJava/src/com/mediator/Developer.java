package com.mediator;

public class Developer extends Employee{
	public Developer(IMediator aMeadiator) {
		super(aMeadiator);
		System.out.println("Developers have signed up for schooling \n");
	}
}
