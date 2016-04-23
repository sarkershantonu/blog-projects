package com.strategy;

public class BattleShip extends Ship{
	public BattleShip(String aName) {
		super(aName);
		System.out.println("A Battle ship is created");
		work=new HeavyArtillery();
	}
}
