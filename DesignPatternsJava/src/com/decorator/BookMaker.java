package com.decorator;

//This is decorator abstract which composite all decorators togather
public abstract class BookMaker implements IBook{
	protected IBook aBook;
	public BookMaker(IBook book) {
		aBook = book;
	}	
	public String getDescription() {
		return aBook.getDescription();
	}	
	public double getPrice() {
		return aBook.getPrice();
	}
}
