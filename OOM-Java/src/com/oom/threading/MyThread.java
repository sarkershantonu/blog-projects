package com.oom.threading;

public class MyThread extends Thread{
	
	private Thread thread = new Thread(); 
	@Override
	public void start()
	{
		super.start();
	}
	@Override
	public void run()
	{
		System.out.println("Thread is running "); 
	}
}
