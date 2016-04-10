package com.FactoryMethod;

public class Factory implements IFactory{
	Products productName; 	
	public IProduct createProduct()
	{	
		switch(productName)
		{
			case pen : 
			return new Pen();
			case pencil :
			return new Pencil();
		}
		return null;
	}
	public Factory(Products product) {
		this.productName = product;
	}
}