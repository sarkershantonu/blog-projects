package com.stateDesignPattern;

public class AdbState implements IState{
	private IMobile myMobile;
	public AdbState(IMobile aMobile){
		myMobile = aMobile;
	}
	public void charge() {
		System.out.println("While ADB mode, your device is by default charging");
		myMobile.setMobileState(myMobile.getCharging());
	}
	public void usbMount() {
		System.out.println("While ADB mode , device can not mount as USB storage, please select USB mount from Device");
		myMobile.setMobileState(myMobile.getUsb());
	}
	public void adbConnect() {
		System.out.println("Your device is connected in Android Debugging Mode, to cancel ADB mode please dis-select Android Debugging from Device settings");
	}
}
