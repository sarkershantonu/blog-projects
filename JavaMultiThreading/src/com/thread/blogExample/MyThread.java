package com.thread.blogExample;

public class MyThread extends Thread{
	public MyThread(){
		this("No Name Provided"); 
	}
	public MyThread(String name) {
		super.setName(name);
		System.out.println("Extended Thread Created: " + name+" : Status ->"+super.getState().toString());				
	}		
	public MyThread(Runnable arunnable, String name) {
		super(arunnable, name); 
		System.out.println("Extended Thread Created with runnable : " + name+" : Status ->"+super.getState().toString());			
	}	
	@Override
	public void start(){
		super.start();
		System.out.println("Thread started "+super.getName()+" : Status ->"+super.getState().toString());
	}
	@Override
	public void run() {
		System.out.println("Thread is running "+super.getName()+" : Status ->"+super.getState().toString());		
	}	
}
