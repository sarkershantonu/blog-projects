package com.stateDesignPattern;

public class Program {

	public static void main(String[] args) {
		IMobile samsungGalaxy = new Android();//initial state will be charging 
		samsungGalaxy.ChargeMobile();
		samsungGalaxy.AdbAccess();//mode will be change to ADB
		samsungGalaxy.AdbAccess();
		samsungGalaxy.USBConnect();//mode will change to USB
		samsungGalaxy.USBConnect();
	}
}
