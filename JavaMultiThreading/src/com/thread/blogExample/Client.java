 package com.thread.blogExample;

public class Client {

	public static void main(String[] args) {
		try{
			//runThreadByExtendingThread(); 
			runThreadByImplementRunnable();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	public static void runThreadByExtendingThread(){
		MyThread t;
		for(int i=0; i<=5; i++){
			t=new MyThread("T Name : "+i);	
			System.out.println("Thread Created, Serial = "+i+", Name :"+t.getName() +" ID : "+t.getId()+" Status : "+t.getState().toString());
			t.start();
			System.out.println("Thread started, Serial = "+i+", Name :"+t.getName() +" ID : "+t.getId()+" Status : "+t.getState().toString());
		}
	}
	public static void runThreadByImplementRunnable(){
		MyRunnable runnable; 
		Thread t2; 
		for(int i=0; i<=5; i++){
		runnable = new MyRunnable();
		t2=new Thread(runnable,"T Name : "+i);
		System.out.println("Thread Created, Serial = "+i+", Name :"+t2.getName() +" ID : "+t2.getId()+" Status : "+t2.getState().toString());
		t2.start();
		System.out.println("Name :"+t2.getName() +" ID : "+t2.getId()+" Status : "+t2.getState().toString());
	}
	}

}
