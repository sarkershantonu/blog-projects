package com.visitor;

public class Fruit implements ITaxable{
	private double price;
	public Fruit(double aPRice){
		price=aPRice;
	}public double getPrice(){
		return price;
	}
	public double addTaxMonitor(ITaxMonitor taxMonitor) {		
		return taxMonitor.addTax(this);
	}
}
