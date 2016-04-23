package com.visitor;

public class Chocolate implements ITaxable{
	private double price;
	public Chocolate(double aPRice){
		price=aPRice;
	}
	public double getPrice(){
		return price;
	}public double addTaxMonitor(ITaxMonitor taxMonitor) {		
		return taxMonitor.addTax(this);
	}
}
