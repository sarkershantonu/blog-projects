package com.strategy;

public class Ship {
	private String name; 
	public IStrategyBehaviour work;
	public void getToWork(){
		work.carry();
	}
	public void setToWork(IStrategyBehaviour aWork){
		work=aWork;
	}
	public Ship(String aName){
		name=aName;
		//System.out.println("A ship is created");
	}
	public String getName() {
		return name;
	}		
}
