package com.threading.practice;

public class Producer extends Thread{
	private Stock myStocks; 
	public Producer(Stock s){
		this.myStocks = s;
	}
	@Override
	public void run(){
	myStocks.setQonhand(15);
	}
}
