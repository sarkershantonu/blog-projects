package com.strategy;

public class Program {

	public static void main(String[] args) {
		Ship aFireShip = new FireShip("Fire Ship");
		//Ship aPassengerShip = new PassengerShip("Passenger Ship");
		//Ship aBattleShip = new BattleShip("Battle Ship");
		//Ship aCargoShip = new CargoShip("Cargo Ship");
		System.out.print("Fire ship is " );
		aFireShip.getToWork();
		aFireShip.setToWork(new Goods());
		System.out.print("Fire ship is now ");
		aFireShip.getToWork();
	}
}
