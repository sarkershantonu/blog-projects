package com.bridgePattern;

public class Program {
	public static void main(String[] args) {
		Flasher anUsbFlasher = new USBFlasher(new USBDevice());
		Flasher aSerialFlasher = new SerialFlasher(new SerialDevice());
		System.out.println("we are flashing serial device");
		aSerialFlasher.connectDevice();
		aSerialFlasher.validateDevice();
		aSerialFlasher.initFlashing();
		aSerialFlasher.communicateViaProtocall();
		if(aSerialFlasher.flashStatus){
			aSerialFlasher.flashDevice();
		}
		aSerialFlasher.eject();
		
		System.out.println("\nwe are flashing usb device");
		anUsbFlasher.connectDevice();
		anUsbFlasher.validateDevice();
		anUsbFlasher.initFlashing();
		anUsbFlasher.communicateViaProtocall();
		if(anUsbFlasher.flashStatus){
			anUsbFlasher.flashDevice();
		}
		anUsbFlasher.eject();
	}
}
