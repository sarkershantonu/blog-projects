package com.strategy;

public class FireShip extends Ship{
	public FireShip(String aName) {
		super(aName);
		System.out.println("A fire ship is created");
		work=new HeavyArtillery();
	}
}
