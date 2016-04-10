package com.caller;

import java.lang.reflect.Constructor;

import com.Target.Asian;
import com.core.ClassReflector;

public class Client {

	public static void main(String[] args) {
		ClassReflector myClassReflector = new ClassReflector(Asian.class);
		p(myClassReflector.getClassName());
		int i=1;
		for(@SuppressWarnings("rawtypes") Constructor a: Asian.class.getConstructors()){
			p("Constructor "+i+": "+a.getName());
			i++;
		}
	
	}
	private static void p(String string){
		System.out.println(string);
	}
}
