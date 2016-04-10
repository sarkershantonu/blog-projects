package com.memento;

public class Program {
	public static void main(String[] args) {
		new Program();
	}
	CareTaker myStore = null;
	Originator originator = null;
	public static int itemNumber = 0;
	public Program(){
		myStore = new CareTaker();
		originator = new Originator();
		System.out.println("Storing Memento");
		originator.set("My Initial State");//Initial first time
		myStore.add(originator.store());
		itemNumber++;
		originator.set("My Changed State which will not be stored and will be restored");
		System.out.println("Restored : "+ originator.restore(myStore.getMemento(itemNumber-1)));//restored		
	}
}
