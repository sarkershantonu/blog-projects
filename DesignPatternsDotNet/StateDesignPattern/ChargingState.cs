using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StateDesignPattern
{
  public class ChargingState : IState{
	private IMobile myMobile;
	public ChargingState(IMobile aMobile){
		myMobile = aMobile;
	}
    public void Charge()
    {
		Console.WriteLine("Mobile is connected to PC for charging only");
	}
    public void UsbMount()
    {
		Console.WriteLine("While Charging Only mode device can not mount as USB storage, please select USB mount from Device");
		myMobile.State=myMobile.GetUsb();
	}
    public void AdbConnect()
    {
		Console.WriteLine("While Charging Only mode we can not access ADB , please select Android Debugging from Device settings");
		myMobile.State=myMobile.GetAdb();
	}
}
}
