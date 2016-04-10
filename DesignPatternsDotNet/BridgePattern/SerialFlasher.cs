using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BridgePattern
{
   public class SerialFlasher : Flasher{

	public SerialFlasher(SerialDevice aDevice): base(aDevice) //we can keep that abstract(that means public SerialFlasher(Device aDevice)) but, i felt is logical to use specific flasher for specific device. 
	{
	}
	public override void CommunicateViaProtocall() {
		Console.WriteLine("Sysem is communicating with USB devices for flashing");
	}
	public override void FlashDevice() {
		Console.WriteLine("USB Flasher is flashing "+myDevice.Type+" Device");
	}
}
}
