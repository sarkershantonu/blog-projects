package com.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class SMSService implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		String data = (String)arg1;
		System.out.println("I have notified by SMS : "+data);
		
	}
	

}
