package com.abstractfactory;

public class ShopToilet implements IToilet{
	public ShopToilet(){
		System.out.println("Shop toilet is created"); 
	}
	public String toString(){
		return "no bathtub and no shawar ";
	}
}
