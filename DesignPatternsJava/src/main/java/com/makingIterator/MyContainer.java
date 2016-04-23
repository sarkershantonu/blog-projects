package com.makingIterator;


public class MyContainer implements IContainer{
	private String[] bookNames = {"Design Pattern", "OOAD", "JAVA","C#"};
	private int iteratorPosition=0;	
	public IIterator createIterator() {
		return new MyIterator();
	}
	private class MyIterator implements IIterator{
		public boolean hasNext() {
		if(iteratorPosition<bookNames.length){
			return true;
		}else
			return false;
		}

		public Object next() 
		{
			if(this.hasNext()){
				return bookNames[iteratorPosition++];
			}
			else
				return null;
			}
		}
}
