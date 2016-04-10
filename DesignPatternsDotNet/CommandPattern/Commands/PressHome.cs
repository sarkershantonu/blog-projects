using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern.Commands
{
    public class PressHome : ICommand{
	private IReceiver myReceiver  = null;
	public PressHome(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void Execute() {
		myReceiver.Home();	
	}
	public void Undo() {
		myReceiver.Back();
	}
}
}
