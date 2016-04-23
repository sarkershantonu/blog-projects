package com.abstractfactory;

public class Office extends House{
	private IHouseBuilder myBuilder;
	public Office(IHouseBuilder aBuilder) {
		myBuilder=aBuilder;
		System.out.println("Office Created");
	}
	public void makehouse() {
		System.out.println("Making  "+getName());
		aDoor = myBuilder.addDoor();
		furniture = myBuilder.addFurniture();
		aToilet=myBuilder.addToilet();
		aWindow=myBuilder.addWindow();
	}
}
