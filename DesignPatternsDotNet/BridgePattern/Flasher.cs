using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BridgePattern
{
    public abstract class Flasher
    {
        protected Device myDevice = null;
        public bool flashStatus = false;
        public Flasher(Device aDevice)
        {
            myDevice = aDevice;
        }
        public void ConnectDevice()
        {
            myDevice.ConnectDevice();
        }
        public void ValidateDevice()
        {
		if(myDevice.ValidateDevice()){
			Console.WriteLine(myDevice.Type+" device is a valid in the system");
			flashStatus=true;
		}else{
			Console.WriteLine(myDevice.Type+" device is a not valid in the system");
		}
	}
        public void InitFlashing(){
		Console.WriteLine("A "+myDevice.Type +" is initilizing from flashing");
	}
        public abstract void CommunicateViaProtocall();
        public abstract void FlashDevice();
        public void Eject()
        {
            myDevice.EjectDevice();
        }
    }
}
