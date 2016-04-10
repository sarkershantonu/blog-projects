package com.prototype;

public class Client {
	public static void main(String[] args) {
		BookManagerFactory bookCloner = new BookManagerFactory();
		IBookPrototype aCloneBook = null; 
		IBookPrototype aBook = new AdventureBook();
		aCloneBook=(AdventureBook)bookCloner.getClone(aBook);
		System.out.println("The hash code for original Adventure book = "+System.identityHashCode(aBook));
		System.out.println("The hash code for cloned Adventure book = "+System.identityHashCode(aCloneBook));
		aBook = new KidsBook();
		aCloneBook=(KidsBook)bookCloner.getClone(aBook);
		System.out.println("The hash code for original kid book = "+System.identityHashCode(aBook));
		System.out.println("The hash code for cloned kid book = "+System.identityHashCode(aCloneBook));
	}
}
