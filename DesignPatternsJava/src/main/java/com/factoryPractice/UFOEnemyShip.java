package com.factoryPractice;

public class UFOEnemyShip extends EnemyShip{
	IEnemyShipFactory myShipFactory;

	public UFOEnemyShip(IEnemyShipFactory shipFactory){
		myShipFactory = shipFactory;
		System.out.println("UFO Created");
	}
	public void makeShip() {
		System.out.println("Making enemy ship "+getName());
		weapon = myShipFactory.addESGuns();
		engine = myShipFactory.addESEngine();
	}
}
