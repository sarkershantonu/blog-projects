package com.abstractfactory;

public abstract class Contractor {
	protected abstract House makeHouse(String typeOfHouse);	
	public House orderAhouse(String typeOfHouse){
		House myHouse = makeHouse(typeOfHouse);
		myHouse.makehouse();
		myHouse.displayName();		
		return myHouse;
	}
}
