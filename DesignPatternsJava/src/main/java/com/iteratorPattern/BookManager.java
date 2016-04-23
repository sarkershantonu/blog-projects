package com.iteratorPattern;

import java.util.Iterator;

public class BookManager {
	Detectivebooks detectiveCollection; 
	ScienceBook scienceCollection;
	Adventurebook adventureCollection;
	public BookManager(){	
		detectiveCollection= new Detectivebooks();
		scienceCollection= new ScienceBook();
		adventureCollection = new Adventurebook();
	}
	public void showAllBooks(){		
		System.out.println("Adventure books : ");
		printBooks(adventureCollection.createIterator());
		System.out.println("Science books : ");
		printBooks(scienceCollection.createIterator());
		System.out.println("Detective books : ");
		printBooks(detectiveCollection.createIterator());
	}
	private void printBooks(Iterator iterator){
		while(iterator.hasNext()){
			Book aBook = (Book)iterator.next();
			System.out.println("This is Book Name "+ aBook.getTitle());
		}
	}
}
