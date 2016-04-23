package com.abstractfactory;

public class OfficeBuilder implements IHouseBuilder{
	public OfficeBuilder(){
		System.out.println("Shop builder is created");
	}
	public IDoor addDoor() {
		return new OfficeDoor();
	}	
	public IWindow addWindow() {
		return new OfficeWindow();
	}
	public IToilet addToilet() {
		return new OfficeToilet();
	}
	public IFurniture addFurniture() {
		return new OfficeFurniture();
	}
}
