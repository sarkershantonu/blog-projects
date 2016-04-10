using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StateDesignPattern
{
    //Context Class
public class Android : IMobile{
	private IState charging;
	private IState usb;
	private IState adb;
	
	private IState mobileState;	
	public IState State{
        set { mobileState = value; }
	}
	public Android(){
		charging = new ChargingState(this);
		usb = new USBMountingState(this);
		adb = new AdbState(this);
		mobileState = charging;
	}
	//next three are for accessing functions in one state
	public void ChargeMobile(){
		mobileState.Charge();
	}
    public void USBConnect()
    {
		mobileState.UsbMount();
	}
    public void AdbAccess()
    {
		mobileState.AdbConnect();
	}
	// next three are getting states
    public IState GetCharging()
    {
		return charging;
	}
    public IState GetUsb()
    {
		return usb;
	}
    public IState GetAdb()
    {
		return adb;
	}
}
}
