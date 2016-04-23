package com.command;

public class PressHome implements ICommand{
	private IReceiver myReceiver  = null;
	public PressHome(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.home();	
	}
	public void undo() {
		myReceiver.back();
	}
}
