package com.strategy;

public class CargoShip extends Ship{
	public CargoShip(String aName) {
		super(aName);
		System.out.println("A cargo ship is created");
		work=new Goods();
	}
}
