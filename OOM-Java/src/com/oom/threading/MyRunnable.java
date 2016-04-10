package com.oom.threading;

public class MyRunnable implements Runnable{
	private Thread thread;

	public MyRunnable(){
		thread = new Thread(this, "Runnable thread");
		thread.start();
		System.out.println("my thread started");
		
	}
	@Override
	public void run() {
		System.out.println("my thread is running "); 
		
	}

}
