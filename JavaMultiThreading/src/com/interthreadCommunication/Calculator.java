package com.interthreadCommunication;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;

public class Calculator implements Runnable {
	private DataInputStream dis; 
	private PipedInputStream pis; 
	public Calculator(PipedInputStream pis){
		this.pis = pis; 
		dis=new DataInputStream(this.pis); 
	}
	@Override
	public void run() {		
		average(); 		
	}
	private void average(){
		double total = 0.0; 
		int counter=0; 
		while(true){			
			try {
				counter++;
				total+=dis.readDouble();
				System.out.println("Total "+total+" -> Number "+counter+" : Current Average = "+ String.format("%1.2f", total/counter));
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
	

}
