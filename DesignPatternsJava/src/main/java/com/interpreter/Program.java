package com.interpreter;

public class Program {
	public static void main(String[] args) {
		System.out.println("We will convert BDT 1000 to other languages");
		CurrencyContext bdtCurrency = new CurrencyContext(1000);
		CurrencyExpression bdConvert = new BDTConverter();
		bdConvert.interpret(bdtCurrency, "usd"); 
		System.out.println("After conversion "+bdtCurrency.getOutput());
	}
}
