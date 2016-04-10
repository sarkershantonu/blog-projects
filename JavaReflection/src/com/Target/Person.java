package com.Target;

public abstract class Person implements Mortality,Humanity{
	private int educationPRIVATE=0;
	protected String assetPROTECTED="Cash, Huse";
	public String namePUBLIC;
	String addressDEFAULT;
	private int agePRIVATE=0;
	public void getEducationPUBLIC(){
		educationPRIVATE=+1;
	}
	int getAgeDEFAULT(){
		return agePRIVATE;
	}
	private String tellInfoPRIVATE(){
		return "Name = "+namePUBLIC+"Address = "+addressDEFAULT;
	}
	protected String getAddressPROTECTED() {
		return addressDEFAULT;
	}
	
	Person(){
		
	}
	public Person(String name){
		this();
	}
	protected Person(String name, int age)
	{
		this(name);
		this.agePRIVATE=age;
	}
	
}
