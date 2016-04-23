package com.interpreter;

public class USDConverter extends CurrencyExpression{
	public double usd(int input) {
		return input;
	}
	public double gbp(int input) {
		return input*0.5987;
	}
	public double bdt(int input) {
		return input*77.5164;
	}
	public double myr(int input) {
		return input*3.3025;
	}
}
