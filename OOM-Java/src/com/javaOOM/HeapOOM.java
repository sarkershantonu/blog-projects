package com.javaOOM;

public class HeapOOM {	
	public void oomByMem() throws Exception {
		int arraySize = 2, loop=1;
		TestOOM.showMemoryInfo();
		while(true){
			System.out.print("\nIteration " + loop++);
			TestOOM.showMemoryInfo();			
			int[] fillupmemory = new int[arraySize];			
			arraySize*=2;						
			System.out.println("\nIteration Ends");
			Thread.sleep(3000);
		}
	}
}
