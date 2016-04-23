package com.command;

public class VolumeDown  implements ICommand{
	private IReceiver myReceiver  = null;
	public VolumeDown(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.volumeDowne();	
	}
	public void undo() {
		myReceiver.volumeUp();
	}
}
