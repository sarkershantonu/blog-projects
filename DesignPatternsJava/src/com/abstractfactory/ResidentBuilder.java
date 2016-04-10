package com.abstractfactory;

public class ResidentBuilder implements IHouseBuilder{
	public ResidentBuilder(){
		System.out.println("Resident builder is created");
	}
	public IDoor addDoor() {
		return new ResidentDoor();
	}	
	public IWindow addWindow() {
		return new ResidentWindow();
	}
	public IToilet addToilet() {
		return new ResidentToilet();
	}
	public IFurniture addFurniture() {
		return new ResidentFurniture();
	}
}
