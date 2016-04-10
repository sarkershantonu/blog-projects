using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CommandPattern
{
    public class MobileReceiver : IReceiver{

	private int vol = 0;
	public void Home() {
		Console.WriteLine("You are now at Home Screen");		
	}
	public void On() {
		Console.WriteLine("Mobile is turning on");		
	}
	public void Off() {
		Console.WriteLine("Mobile is turning off");		
	}
	public void VolumeUp() {
		vol++;
		Console.WriteLine("The volume is up to "+vol);		
	}
	public void VolumeDowne() {
		vol--;
		Console.WriteLine("The volume is down to "+vol);		
	}
	public void Back() {
		Console.WriteLine("Going Back...");
	}
}
}
