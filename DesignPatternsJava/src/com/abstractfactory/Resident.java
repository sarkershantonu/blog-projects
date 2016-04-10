package com.abstractfactory;

public class Resident extends House{
	private IHouseBuilder myBuilder;
	public Resident(IHouseBuilder aBuilder) {
		myBuilder=aBuilder;
		System.out.println("Resident house Created");
	}
	public void makehouse() {
		System.out.println("Making  "+getName());
		aDoor = myBuilder.addDoor();
		furniture = myBuilder.addFurniture();
		aToilet=myBuilder.addToilet();
		aWindow=myBuilder.addWindow();
	}
}
