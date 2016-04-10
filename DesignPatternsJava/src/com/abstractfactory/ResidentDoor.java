package com.abstractfactory;

public class ResidentDoor implements IDoor{
	public ResidentDoor(){
		System.out.println("Resident Door is created"); 
	}
	public String toString(){
		return "designed and has bell";
	}

}
