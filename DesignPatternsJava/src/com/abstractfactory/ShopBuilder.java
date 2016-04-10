package com.abstractfactory;

public class ShopBuilder implements IHouseBuilder{
	public ShopBuilder(){
		System.out.println("Shop builder is created");
	}
	public IDoor addDoor() {
		return new ShopDoor();
	}	
	public IWindow addWindow() {
		return new ShopWindow();
	}
	public IToilet addToilet() {
		return new ShopToilet();
	}
	public IFurniture addFurniture() {
		return new ShopFurniture();
	}
}
