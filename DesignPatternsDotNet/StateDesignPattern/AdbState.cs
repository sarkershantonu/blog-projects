using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StateDesignPattern
{
    public class AdbState : IState{
	private IMobile myMobile;
	public AdbState(IMobile aMobile){
		myMobile = aMobile;
	}
    public void Charge()
    {
		Console.WriteLine("While ADB mode, your device is by default charging");
		myMobile.State=myMobile.GetCharging();
	}
    public void UsbMount()
    {
		Console.WriteLine("While ADB mode , device can not mount as USB storage, please select USB mount from Device");
		myMobile.State=myMobile.GetUsb();
	}
    public void AdbConnect()
    {
		Console.WriteLine("Your device is connected in Android Debugging Mode, to cancel ADB mode please dis-select Android Debugging from Device settings");
	}
}
}
