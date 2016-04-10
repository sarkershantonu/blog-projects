package com.thread.blogExample;

public class MyRunnable implements Runnable{
	private static int counter=0;// to see how many time it is calling run()	
	public MyRunnable(){	
	}
	@Override
	public void run() {
		System.out.println("Runnable is running at -> runnable counter "+counter++);		
	}
}
