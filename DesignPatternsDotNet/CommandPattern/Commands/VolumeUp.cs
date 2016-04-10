using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern.Commands
{
   public class VolumeUp : ICommand{
	private IReceiver myReceiver  = null;
	public VolumeUp(IReceiver aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void Execute() {
		myReceiver.VolumeUp();;	
	}
	public void Undo() {
		myReceiver.VolumeDowne();;
	}
}
}
