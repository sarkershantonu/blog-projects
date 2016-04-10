package com.builder;

public class MobileBuilder implements IMobileBuilder{
	private Mobile aMobile=null;
	public MobileBuilder() {
	aMobile=new Mobile();
	}
	public void buildKeypad(){
		aMobile.setKeypad("QWERTY-Pad");
	}
	public void buildSpeaker(){
		aMobile.setSpeaker("Loude Speakers ");
	}	
	public void buildDisplayUnit(){
		aMobile.setDisplayUnit("Touch Display");
	}
	public void buildMic(){
		aMobile.setMic("High sensored mike");
	}
	public void buildNetwrkRadio(){
		aMobile.setNetwrkRadio("3g Network");
	}
	public Mobile getMobile() {
		return aMobile;
	}
}
