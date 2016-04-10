using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BridgePattern
{
    public class USBDevice : Device{
	public USBDevice(){
		type="USB";
		deviceConnectionStatus=true;
	}
	public override bool ValidateDevice() {
		Console.WriteLine("System is validating USB Device");
		return true;
	}
}
}
