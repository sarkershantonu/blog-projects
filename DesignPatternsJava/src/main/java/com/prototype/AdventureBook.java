package com.prototype;

public class AdventureBook implements IBookPrototype{
	public AdventureBook(){
		System.out.println("An adventure book is bought");
	}
	public IBookPrototype makeAClone() {
		AdventureBook aBook=null;
		try {
			aBook = (AdventureBook)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("An adventure book is cloned");
		return aBook;
	}
}
