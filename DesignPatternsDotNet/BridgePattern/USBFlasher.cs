using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BridgePattern
{
   public class USBFlasher : Flasher{

	public USBFlasher(USBDevice aDevice) : base(aDevice)//we can keep that abstract(that means public USBFlasher(Device aDevice)) but, i felt is logical to use specific flasher for specific device. 
	{
	}
	public override void CommunicateViaProtocall() {
		Console.WriteLine("Sysem is communicating with serial port for flashing");
	}
	public override void FlashDevice() {
		Console.WriteLine("Serial Flasher is flashing "+myDevice.Type+" Device");
	}
}
}
