using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BridgePattern
{
    class Program
    {
        static void Main(string[] args)
       {
		Flasher anUsbFlasher = new USBFlasher(new USBDevice());
		Flasher aSerialFlasher = new SerialFlasher(new SerialDevice());
		
            Console.WriteLine("we are flashing serial device");
		aSerialFlasher.ConnectDevice();
		aSerialFlasher.ValidateDevice();
		aSerialFlasher.InitFlashing();
		aSerialFlasher.CommunicateViaProtocall();
		if(aSerialFlasher.flashStatus){
			aSerialFlasher.FlashDevice();
		}
		aSerialFlasher.Eject();
		
		Console.WriteLine("\nwe are flashing usb device");
		anUsbFlasher.ConnectDevice();
		anUsbFlasher.ValidateDevice();
		anUsbFlasher.InitFlashing();
		anUsbFlasher.CommunicateViaProtocall();
		if(anUsbFlasher.flashStatus){
			anUsbFlasher.FlashDevice();
		}
		anUsbFlasher.Eject();

        Console.ReadLine();
	}
    }
}
