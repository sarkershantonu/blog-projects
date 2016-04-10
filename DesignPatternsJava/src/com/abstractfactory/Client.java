package com.abstractfactory;

public class Client {
	public static void main(String[] args) {
		Contractor myContractor = new BuildingContractor();
		House myHouse = myContractor.orderAhouse("Shop");
		System.out.println(myHouse+"\n");
		myHouse = myContractor.orderAhouse("Office");
		System.out.println(myHouse+"\n");
		myHouse = myContractor.orderAhouse("Resident");
		System.out.println(myHouse+"\n");
	}
}
