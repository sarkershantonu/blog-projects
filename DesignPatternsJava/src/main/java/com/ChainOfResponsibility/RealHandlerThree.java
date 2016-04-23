package com.ChainOfResponsibility;

public class RealHandlerThree extends MyHandler{

	public void doThis(Task task){
		if(task.getValue()>0)
		{
			System.out.println("This is Handler Three and value = "+ task.getValue());
			
		}else{
			myNextHandler.doThis(task);	
		}		
	}
	public RealHandlerThree() {		
	}

}
