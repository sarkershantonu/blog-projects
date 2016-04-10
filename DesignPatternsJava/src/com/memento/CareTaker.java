package com.memento;

import java.util.ArrayList;

public class CareTaker {
	ArrayList<Memento> mementoes = new ArrayList<Memento>();
	public void add(Memento aMemento){
		mementoes.add(aMemento);
		System.out.println("One Item added, so no item count : "+mementoes.size());
	}
	public Memento getMemento(int index) {
		return mementoes.get(index);		
	}
}
