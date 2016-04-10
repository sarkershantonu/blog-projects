package com.abstractfactory;

public class ShopDoor implements IDoor{
	public ShopDoor(){
		System.out.println("Shop Door is created"); 
	}
	public String toString(){
		return "not designed and has no bell";
	}
}
