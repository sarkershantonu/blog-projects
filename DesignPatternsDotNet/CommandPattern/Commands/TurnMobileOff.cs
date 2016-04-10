using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern.Commands
{
    public class TurnMobileOff : ICommand{
	private IReceiver myReceiver  = null;
	public TurnMobileOff(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void Execute() {
		myReceiver.Off();	
	}
	public void Undo() {
		myReceiver.On();
	}
}
}
