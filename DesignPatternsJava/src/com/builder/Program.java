package com.builder;

public class Program {
	public static void main(String[] args) {
		IMobileBuilder aBuilder = new MobileBuilder();
		MobileMaker aMaker = new MobileMaker(aBuilder);
		aMaker.buildMobile();
		Mobile aMobile = aMaker.getMobile();
		System.out.println("A Mobile is ordered to build");
		System.out.println("The Mobile Keypad = "+aMobile.getKeypad());
		System.out.println("The Mobile Display = "+aMobile.getDisplayUnit());
		System.out.println("The Mobile Netwrk = "+aMobile.getNetwrkRadio());
		System.out.println("The Mobile Speaker = "+aMobile.getSpeaker());
		System.out.println("The Mobile Mic = "+aMobile.getMic());
	}
}
