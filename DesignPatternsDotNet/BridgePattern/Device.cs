using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BridgePattern
{
    public abstract class Device
    {
        protected string type = "Generic Device";
        protected bool deviceConnectionStatus = false;
        public string Type
        {
            get
            {
                return type;
            }
        }
        public void ConnectDevice()
        {
            Console.WriteLine("A device is connected"); 
		    deviceConnectionStatus=true;
	    }
        public abstract bool ValidateDevice();
        public void EjectDevice(){
		    Console.WriteLine("Ejecting.....");
		    deviceConnectionStatus=false;
	    }
    }
}
