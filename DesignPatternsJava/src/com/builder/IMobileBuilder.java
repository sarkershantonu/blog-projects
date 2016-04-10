package com.builder;

public interface IMobileBuilder {
	public void buildKeypad();
	public void buildSpeaker();
	public void buildDisplayUnit() ;
	public void buildMic();
	public void buildNetwrkRadio();
	public Mobile getMobile();
}
