package com.decorator;

public class Client {
	public static void main(String[] args) {
		IBook rawBook = new OffsetPrinting(new FoilPaperCovering(new Leminate(new PlainBook())));
		System.out.println("Description "+rawBook.getDescription());
		System.out.println("Total Price "+rawBook.getPrice());
	}
}
