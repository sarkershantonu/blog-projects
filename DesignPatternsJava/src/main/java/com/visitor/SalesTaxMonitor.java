package com.visitor;

public class SalesTaxMonitor implements ITaxMonitor{
	public double addTax(Chocolate aChocolate) {
		System.out.println("Sales Tax Added with a Chocolate");
		return aChocolate.getPrice()*1.015;
	}
	public double addTax(SoftDrink aDrink) {
		System.out.println("Sales Tax Added with a Drink");
		return aDrink.getPrice()*1.015;
	}
	public double addTax(Fruit aFruit) {
		System.out.println("Sales Tax Added with a Fruit");
		return aFruit.getPrice()*1.015;
	}
}
