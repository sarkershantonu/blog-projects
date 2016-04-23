package com.Composite;

public class BookShelf {
	BookComponent newBookList;
	public BookShelf(BookComponent bookType){
		newBookList = bookType;
	}
	public void getBookList() {
		newBookList.displayBookInfo();
	}
}
