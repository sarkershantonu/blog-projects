package com.abstractfactory;

public class Shop extends House{
	private IHouseBuilder myBuilder;
	public Shop(IHouseBuilder aBuilder) {
		myBuilder=aBuilder;
		System.out.println("Shop Created");
	}
	public void makehouse() {
		System.out.println("Making  "+getName());
		aDoor = myBuilder.addDoor();
		furniture = myBuilder.addFurniture();
		aToilet=myBuilder.addToilet();
		aWindow=myBuilder.addWindow();
	}
}
