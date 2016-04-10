package com.command;

public class VolumeUp implements ICommand{
	private IReceiver myReceiver  = null;
	public VolumeUp(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.volumeUp();;	
	}
	public void undo() {
		myReceiver.volumeDowne();;
	}
}
