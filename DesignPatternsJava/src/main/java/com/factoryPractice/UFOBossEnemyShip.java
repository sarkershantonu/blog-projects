package com.factoryPractice;

public class UFOBossEnemyShip extends EnemyShip{
	IEnemyShipFactory myShipFactory;

	public UFOBossEnemyShip(IEnemyShipFactory shipFactory){
		myShipFactory = shipFactory;
		System.out.println("UFO Boss Created");
	}
	public void makeShip() {
		System.out.println("Making enemy boss ship "+getName());
		weapon = myShipFactory.addESGuns();
		engine = myShipFactory.addESEngine();
	}

}
