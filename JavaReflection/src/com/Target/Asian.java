package com.Target;

public class Asian extends Person{

	@Override
	public String donate() {
		return "Donaton to socity";
	}

	@Override
	public String Educate(Person aPerson) {
		aPerson.getEducationPUBLIC();
		return "Education Done to "+aPerson.namePUBLIC;
	}
	Asian(){
		super();
	}
	public Asian(String a){
		super(a);
	}
	public Asian(String a, int age){
		super(a, age);
	}
	public Asian(String a, int age, String asset){
		this(a,age);
		this.assetPROTECTED=asset;
	}

}
