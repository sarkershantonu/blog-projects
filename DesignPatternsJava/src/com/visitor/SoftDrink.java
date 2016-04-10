package com.visitor;

public class SoftDrink implements ITaxable{
	private double price;
	public SoftDrink(double aPRice){
		price=aPRice;
	}public double getPrice(){
		return price;
	}public double addTaxMonitor(ITaxMonitor taxMonitor) {		
		return taxMonitor.addTax(this);
	}
}
