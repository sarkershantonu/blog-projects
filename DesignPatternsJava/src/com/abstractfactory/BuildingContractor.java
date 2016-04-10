package com.abstractfactory;
//This class is responsible for creating all factory classes to build product objects 
public class BuildingContractor extends Contractor{
	public BuildingContractor() {
		System.out.println("Building contractor created ");
	}
	public House makeHouse(String typeOfHouse) {
		House myHouse = null;
		IHouseBuilder myBuilder = null;
		if(typeOfHouse.equals("Resident")){
			myBuilder = new ResidentBuilder();
			myHouse = new Resident(myBuilder);
			myHouse.setName("Resident House");
		} 
		else if(typeOfHouse.equals("Office")){
			myBuilder = new OfficeBuilder();
			myHouse = new Office(myBuilder);
			myHouse.setName("Office");
		} 
		else if(typeOfHouse.equals("Shop")){
			myBuilder = new ShopBuilder();
			myHouse = new Shop(myBuilder);
			myHouse.setName("Shop");
		}		
		return myHouse;
	}
}
