using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern.Commands
{
  public class TurnMobileOn : ICommand{
	private IReceiver myReceiver  = null;
	public TurnMobileOn(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void Execute() {
		myReceiver.On();	
	}
	public void Undo() {
		myReceiver.Off();
	}
}
}
