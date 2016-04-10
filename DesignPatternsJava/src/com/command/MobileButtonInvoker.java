package com.command;



public class MobileButtonInvoker {
	private ICommand aCommand;
	//private ArrayList<ICommand> commandQueue = new ArrayList<ICommand>();
	//If we want to apply stack based undo operation, we can keep an array list of ICommands and perform undo by invoker, but I apply that undo in ICommand.
	public MobileButtonInvoker(ICommand newConnand){
		aCommand=newConnand;
	}
	public void press() {
		aCommand.execute();
		//commandQueue.add(aCommand);
	}
	public void pressBack() {
		aCommand.undo();
	}
}
