package com.abstractfactory;

public class ResidentFurniture implements IFurniture{
	public ResidentFurniture(){
		System.out.println("Resident furniture is created"); 
	}
	public String toString(){
		return "Full Free Furniture";
	}
}
