package com.practiceOne;


public class JustTest {
	
	public static void main(String[] args) {
		Thread t = new Thread(); 
		print(t.toString());
		t.setName("Shantonu");
		print(t.toString());
		
		for(int i=0; i<=25;i++){
			print(String.valueOf(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				print("Interrepted");
			}
		}
	}
	
	private static void print(String s){
		System.out.println(s);
	}

}
