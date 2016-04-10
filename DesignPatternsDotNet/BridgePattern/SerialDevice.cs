using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BridgePattern
{
    public class SerialDevice : Device{
	public SerialDevice(){
		type="Serial";
		deviceConnectionStatus=true;
	}
	public override bool ValidateDevice() {
		Console.WriteLine("System is validating Serial device");
		return true;
	}
}

}
