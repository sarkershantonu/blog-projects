package com.command;

public class TurnMobileOn implements ICommand{
	private IReceiver myReceiver  = null;
	public TurnMobileOn(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.on();	
	}
	public void undo() {
		myReceiver.off();
	}
}