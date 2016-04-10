using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern.Commands
{
   public class VolumeDown  : ICommand{
	private IReceiver myReceiver  = null;
	public VolumeDown(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void Execute() {
		myReceiver.VolumeDowne();	
	}
	public void Undo() {
		myReceiver.VolumeUp();
	}
}
}
