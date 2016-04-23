package com.command;

public class PressBack implements ICommand{
	private IReceiver myReceiver  = null;
	public PressBack(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.back();
	}
	public void undo()// Usually back is the undo it self.
	{
		myReceiver.back();
	}
}
