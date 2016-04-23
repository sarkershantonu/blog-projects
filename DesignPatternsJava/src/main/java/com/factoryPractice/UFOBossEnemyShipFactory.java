package com.factoryPractice;

public class UFOBossEnemyShipFactory implements IEnemyShipFactory{
	public UFOBossEnemyShipFactory() {System.out.println("UFOBossEnemyShipFactory created");}
	public IEngine addESEngine(){
		return new ESUFOBossEngine();
	}
	public IWeapon addESGuns(){
		return new ESUFOBossGun();
	}
}
