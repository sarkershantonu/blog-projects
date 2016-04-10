package com.FactoryMethod;
public class Client {
	public static void main(String[] args) {
		IFactory creator = new Factory(Products.pen);
		deliverProductToAShop(creator);
		creator = new Factory(Products.pencil);
		deliverProductToAShop(creator);
	}	
	public static void deliverProductToAShop(IFactory aFactory) {
		IProduct aProduct = aFactory.createProduct();
		aProduct.showMe();
	}
}
