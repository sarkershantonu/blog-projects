package com.interthreadCommunication;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.Random;

public class NumberGenerator implements Runnable{
	private PipedOutputStream pos; 
	private DataOutputStream dos; 
	public NumberGenerator() {
			
	}
	public NumberGenerator(PipedOutputStream pos2) {		
		pos =pos2; 
		dos = new DataOutputStream(pos); 	 		
	}
	private void generateNumber(){		
		while(true){					
			try {
				dos.writeDouble(new Random().nextDouble()*10);
				dos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
	@Override
	public void run() {
		generateNumber();
		
	}
}
