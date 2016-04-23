package com.abstractfactory;

public class ResidentToilet implements IToilet{
	public ResidentToilet(){
		System.out.println("Residen toilet is created"); 
	}
	public String toString(){
		return "bathtub and shawar ";
	}
}
