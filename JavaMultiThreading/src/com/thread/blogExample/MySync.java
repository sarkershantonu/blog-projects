package com.thread.blogExample;

public class MySync {
	public static int i=0; 
	public MySync(){
		System.out.println("Sync Object Created");
	}
	
	public synchronized void printingObjects(){
		for(i=0; i<=1000;i++){
		System.out.println("Printing "+i);
		}
	}
}
