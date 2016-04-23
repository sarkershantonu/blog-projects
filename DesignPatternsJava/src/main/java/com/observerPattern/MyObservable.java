package com.observerPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class MyObservable {
	private List<MyObserver> observers = new ArrayList<MyObserver>();
	public void notifyAllOvservers(){
		for(int i=0; i<observers.size();i++){
			observers.get(i).update();
		}
	}
	public void notifyAllOvservers(Object arg){
	//Just another way to notify with arguments
		for(int i=0; i<observers.size();i++){
			observers.get(i).update(arg);
		}		
	}
	public void attachAObserver(MyObserver observer) {
		observers.add(observer);
	}
	public void detachAObserver(MyObserver observer) {	
		observers.remove(observer);
	}
	public int countObservers(){
		return observers.size();		
	}
	protected abstract void setChange();
	protected abstract void clearChange();
	protected abstract void hasChange();
	public MyObservable(){				
	}
}
