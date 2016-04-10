package com.javaOOM;

import java.util.ArrayList;
import java.util.List;

public class ThreadOOM {
	public static void createOOMbyThread(){
		List<Thread> allThreads = new ArrayList<Thread>();
		try{
		while(true)	
		{
			long startTime = System.currentTimeMillis();			
			Thread aThread = new Thread(new Runnable(){// Anonymous runnable class
		          @Override
		          public void run() {
		        	  //System.out.println("Thread is running");
		            try {
		              while (!Thread.interrupted())//this will sleep the thread untill it is stopped.  
		              {		            	  
		                Thread.sleep(1);
		              }} catch (InterruptedException ignored) {}}});
		        aThread.setDaemon(true);
		        aThread.setPriority(Thread.MIN_PRIORITY);
		        allThreads.add(aThread);
		        aThread.start();	
			long endTime = System.currentTimeMillis();
			Thread.sleep(1);//i disabled this in JVM 8 as it takes long time for OOM
			System.err.println("Total Thread = "+allThreads.size()+" Required time(ms) = "+(endTime-startTime));			
		}
		}catch(Throwable e){
			System.err.println("\nError at "+ allThreads.size()+" threads"); 
			e.printStackTrace();
		}	
}
	
	public static void createThreadOOM(){
		int iteration = 1;
		TestOOM.showMemoryInfo(); 
		while(true){
			System.out.println("Iteration : "+iteration++); 
			new Thread(new Runnable(){//Anonymous class  
				@Override
				public void run() {
					System.out.println("Thread is running");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
				}				
			}).start(); 			
			TestOOM.showMemoryInfo(); 
		}
	}
}
