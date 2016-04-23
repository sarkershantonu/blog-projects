package com.flyweight;


public class Program {
	public static void main(String[] args) {
		new Program();
	}
	public Program(){
		long startTime = System.currentTimeMillis();
		for(int i =1; i<=1000; i++){
			AccountMaker.getAccount(AccountType.getARandomeType()).printInformation();
			//new Account(AccountType.getARandomeType()).printInformation();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Passed : "+(endTime-startTime)+" MS");
	}
}
