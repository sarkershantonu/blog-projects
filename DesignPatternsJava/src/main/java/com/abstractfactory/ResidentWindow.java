package com.abstractfactory;

public class ResidentWindow implements IWindow{
	public String toString(){
		return "Size 10";
	}
	public ResidentWindow(){
		System.out.println("Resident window is created");
	}
}
