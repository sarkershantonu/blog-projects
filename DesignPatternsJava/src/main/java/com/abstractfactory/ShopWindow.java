package com.abstractfactory;

public class ShopWindow implements IWindow{
	public String toString(){
		return "Size 40";
	}
	public ShopWindow(){
		System.out.println("Shop Window is created");
	}
}
