package com.prototype;

public class KidsBook implements IBookPrototype{
	public KidsBook(){
		System.out.println("A Kids book is bought");
	}
	public IBookPrototype makeAClone() {
		KidsBook aBook=null;
		try {
			aBook = (KidsBook)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("A Kids book is cloned");
		return aBook;
	}
}

