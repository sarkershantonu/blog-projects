package com.visitor;
//The visitor interface
public interface ITaxMonitor {
	public double addTax(Chocolate aChocolate);
	public double addTax(SoftDrink aDrink);
	public double addTax(Fruit aFruit);
}
