package com.builder;

public class MobileMaker {
	private IMobileBuilder myBuilder;
	public MobileMaker(IMobileBuilder aBuilder){
		myBuilder=aBuilder;
	}
	public Mobile getMobile(){
		return myBuilder.getMobile();
	}
	public void buildMobile(){
		myBuilder.buildDisplayUnit();
		myBuilder.buildKeypad();
		myBuilder.buildMic();
		myBuilder.buildNetwrkRadio();
		myBuilder.buildSpeaker();
	}
}
