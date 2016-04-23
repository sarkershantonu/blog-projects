package com.abstractfactory;

public class OfficeFurniture implements IFurniture{
	public OfficeFurniture(){
		System.out.println("Office furniture is created"); 
	}
	public String toString(){
		return "Full paid Furniture";
	}
}
