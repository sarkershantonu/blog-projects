package com.abstractfactory;

public class ShopFurniture implements IFurniture{
	public ShopFurniture(){
		System.out.println("Shop furniture is created"); 
	}
	public String toString(){
		return "Free basic Furniture";
	}
}
