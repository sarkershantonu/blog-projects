package com.command;

public class TurnMobileOff implements ICommand{
	private IReceiver myReceiver  = null;
	public TurnMobileOff(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.off();	
	}
	public void undo() {
		myReceiver.on();
	}
}
