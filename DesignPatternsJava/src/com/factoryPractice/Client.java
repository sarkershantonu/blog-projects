package com.factoryPractice;

public class Client {

	public static void main(String[] args) {
		EnemyShipBuilding myShipOrder = new UFOEnemyShipBuilding();
		EnemyShip myShip = myShipOrder.orderAShip("UFO");
		System.out.println(myShip+"\n");
		EnemyShip myBoss=myShipOrder.orderAShip("UFO BOSS");
		System.out.println(myBoss+"\n");
	}
}
