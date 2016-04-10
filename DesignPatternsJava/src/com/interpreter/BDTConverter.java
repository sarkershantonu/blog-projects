package com.interpreter;

public class BDTConverter extends CurrencyExpression{
	public double usd(int input) {
		return input*0.0129;
	}
	public double gbp(int input) {
		return input*0.0077;
	}
	public double bdt(int input) {
		return input;
	}
	public double myr(int input) {
		return input*0.0426;
	}
}
