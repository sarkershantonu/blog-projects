package com.interthreadCommunication;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class InterThreadCommunication {

	public static void main(String[] args) {
		calculateRunningAverage();

	}
	
	public static void calculateRunningAverage(){
		PipedInputStream pis = new PipedInputStream(); 
		PipedOutputStream pos = new PipedOutputStream(); 
		NumberGenerator ng = new NumberGenerator(pos); 
		Calculator avg = new Calculator(pis);
		try {
			pos.connect(pis);				
		}
		catch (Exception e) {
			e.printStackTrace();
		}		 
		Thread ngThread = new Thread(ng);	
		Thread avgThread = new Thread(avg);
		ngThread.start();
		avgThread.start();		
		
	}

}
