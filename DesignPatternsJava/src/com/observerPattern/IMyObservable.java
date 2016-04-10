package com.observerPattern;


public interface IMyObservable {
	void notifyAllOvservers();
	void notifyAllOvservers(Object arg);
	void attachAObserver(MyObserver observer);	
	void detachAObserver(MyObserver observer);
	int countObservers();
	void setChange();
	void clearChange();
	void hasChange();
}
