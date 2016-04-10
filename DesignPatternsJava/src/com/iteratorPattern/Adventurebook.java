package com.iteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

public class Adventurebook implements IBookIterator{	
	Hashtable <Integer, Book> myAdventurebooks ;
	int hashkey = 0;
	public Adventurebook(){
		myAdventurebooks = new Hashtable<Integer, Book>();
		addBook(new Book("ShutterIsland"));
		addBook(new Book("RobinSonCruso"));
		addBook(new Book("PiretsOfCarriba"));
	}
	public void addBook(Book aBook) {
		myAdventurebooks.put(hashkey, aBook);
		hashkey++;
	}
	public Iterator createIterator() {		
		return myAdventurebooks.values().iterator();
	}
}

