package com.stateDesignPattern;
//Context Class
public class Android implements IMobile{
	private IState charging;
	private IState usb;
	private IState adb;
	
	private IState mobileState;	
	public void setMobileState(IState aState) {
		mobileState= aState;
	}
	public Android(){
		charging = new ChargingState(this);
		usb = new USBMountingState(this);
		adb = new AdbState(this);
		mobileState = charging;
	}
	//next three are for accessing functions in one state
	public void ChargeMobile(){
		mobileState.charge();
	}
	public void USBConnect(){
		mobileState.usbMount();
	}
	public void  AdbAccess() {
		mobileState.adbConnect();
	}
	// next three are getting states
	public IState getCharging() {
		return charging;
	}	
	public IState getUsb() {
		return usb;
	}	
	public IState getAdb() {
		return adb;
	}
}
