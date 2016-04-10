package com.factoryPractice;

public class UFOEnemyShipFactory implements IEnemyShipFactory {
	public UFOEnemyShipFactory(){
		System.out.println("UFOEnemyShipFactory created");
	}
	public IEngine addESEngine(){
		return new ESUFOEngine();
	}
	public IWeapon addESGuns(){
		return new ESUFOGun();
	}
}
