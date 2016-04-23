package com.abstractfactory;

public class OfficeWindow implements IWindow{
	public String toString(){
		return "Size 20";
	}
	public OfficeWindow(){
		System.out.println("Office Window is created");
	}
}
