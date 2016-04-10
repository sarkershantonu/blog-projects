package com.stateDesignPattern;

public class ChargingState implements IState{
	private IMobile myMobile;
	public ChargingState(IMobile aMobile){
		myMobile = aMobile;
	}
	public void charge() {
		System.out.println("Mobile is connected to PC for charging only");
	}
	public void usbMount() {
		System.out.println("While Charging Only mode device can not mount as USB storage, please select USB mount from Device");
		myMobile.setMobileState(myMobile.getUsb());
	}
	public void adbConnect() {
		System.out.println("While Charging Only mode we can not access ADB , please select Android Debugging from Device settings");
		myMobile.setMobileState(myMobile.getAdb());
	}
}
