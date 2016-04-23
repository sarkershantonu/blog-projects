package com.stateDesignPattern;

public class USBMountingState implements IState{
	private IMobile myMobile;
	public USBMountingState(IMobile aMobile){
		myMobile = aMobile;
	}
	public void charge() {
		System.out.println("While USB Only mode, your device is by default charging");
		myMobile.setMobileState(myMobile.getCharging());
	}
	public void usbMount() {
		System.out.println("Deviec is in USB mode, access mobile storage from file explorer");
	}
	public void adbConnect() {
		System.out.println("While USB Only mode we can not access ADB , please select Android Debugging from Device settings");
		myMobile.setMobileState(myMobile.getAdb());
	}
}
