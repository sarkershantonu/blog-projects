package com.javaOOM;

public class TestOOM {
	public static void main(String[] args) throws Exception {
		new HeapOOM().oomByMem(); // testing HeapOOM
		//TestPermGenMetaSpaceOOM.createPermGenOOM();
		//ThreadOOM.createOOMbyThread();
		//GCOverheadOOM.createGCOverheadOOM();
	}	
	public static void showMemoryInfo()
	{
		System.out.print("\nTotal memory : "+Runtime.getRuntime().totalMemory());
		System.out.print(" Free : "+Runtime.getRuntime().freeMemory());
		System.out.print(" Max : "+Runtime.getRuntime().maxMemory()+"\n\n");		
	}
	
		
	
}
