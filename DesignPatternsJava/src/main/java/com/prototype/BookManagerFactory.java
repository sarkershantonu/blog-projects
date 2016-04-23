package com.prototype;

public class BookManagerFactory {
public IBookPrototype getClone(IBookPrototype abook) {
	return abook.makeAClone();
}
}
