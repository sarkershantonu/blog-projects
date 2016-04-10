package com.abstractfactory;
//this is factory class
public interface IHouseBuilder {
	public IDoor addDoor();
	public IWindow addWindow();
	public IToilet addToilet();
	public IFurniture addFurniture();
}
