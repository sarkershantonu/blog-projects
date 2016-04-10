package com.abstractfactory;

public class OfficeDoor implements IDoor{
	public OfficeDoor(){
		System.out.println("Office Door is created"); 
	}
	public String toString(){
		return "designed but no bell";
	}
}
