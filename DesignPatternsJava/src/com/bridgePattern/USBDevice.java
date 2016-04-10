package com.bridgePattern;

public class USBDevice extends Device{
	public USBDevice(){
		type="USB";
		deviceConnectionStatus=true;
	}
	public boolean validateDevice() {
		System.out.println("System is validating USB Device");
		return true;
	}
}
