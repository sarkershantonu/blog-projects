using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern.Commands
{
   public class PressBack : ICommand{
	private IReceiver myReceiver  = null;
	public PressBack(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void Execute() {
		myReceiver.Back();
	}
	public void Undo()// Usually back is the undo it self.
	{
		myReceiver.Back();
	}
}
}
