package com.ChainOfResponsibility;

public abstract class MyHandler {

	protected MyHandler myNextHandler;
	/***
	 * to pass the request to successor, this will be used for making chain
	 * @param successor
	 */
	public void setMyNextHandler(MyHandler successor)
	{
		myNextHandler = successor;
	}
	/***
	 * This method actually responsible for doing task
	 * @param task
	 */
	public abstract void doThis(Task task);	

}

	
	