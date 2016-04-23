package com.abstractfactory;

public abstract class House {
	private String name;
	public String getName(){return name;}
	public void setName(String newName){name=newName;}	
	IDoor aDoor;
	IWindow aWindow;
	IFurniture furniture;
	IToilet aToilet;	
	public abstract void makehouse();	
	public void displayName(){
		System.out.println(getName()+" is the Name of the house");
	}
	public String toString(){
		String info= "The "+name+" has a door which is "+aDoor+", a window which is "+aWindow+
				" , a toilet which has "+aToilet+" and "+furniture;
		return info;
	}
}
