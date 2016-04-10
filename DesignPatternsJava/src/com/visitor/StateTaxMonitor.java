package com.visitor;

public class StateTaxMonitor implements ITaxMonitor{
	public double addTax(Chocolate aChocolate) {
		System.out.println("State Tax Added with a Chocolate");
		return aChocolate.getPrice()*1.005;
	}
	public double addTax(SoftDrink aDrink) {
		System.out.println("State Tax Added with a Drink");
		return aDrink.getPrice()*1.005;
	}
	public double addTax(Fruit aFruit) {
		System.out.println("No State Tax fora Fruit");
		return aFruit.getPrice();
	}
}
