package com.abstractfactory;

public class OfficeToilet  implements IToilet{
	public OfficeToilet(){
		System.out.println("office toilet is created"); 
	}
	public String toString(){
		return "only shawar no bathtub ";
	}

}
