package com.factoryPractice;
//this class does the creation, orders different factory, seems like the trading person.   
public class UFOEnemyShipBuilding extends EnemyShipBuilding{

	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip myShip = null;
		IEnemyShipFactory shipFactory = null;
		if(typeOfShip.equals("UFO"))
		{
			shipFactory = new UFOEnemyShipFactory();
			myShip = new UFOEnemyShip(shipFactory);
			myShip.setName("UFO Ship");
		}
		else if(typeOfShip.equals("UFO BOSS"))
		{
			shipFactory = new UFOBossEnemyShipFactory();
			myShip=new UFOBossEnemyShip(shipFactory);
			myShip.setName("UFO Boss Ship");
		}
		return myShip;
	}

}
