package com.decorator;
//Lemination costs 20 taka extra
public class Leminate extends BookMaker {
	public Leminate(IBook book) {
		super(book);
		System.out.println("Leminated");
	}
	public String getDescription() {
		return aBook.getDescription()+", Leminated";
	}
	public double getPrice() {
		return aBook.getPrice()+20.00;
	}
}
