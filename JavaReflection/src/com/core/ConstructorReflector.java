package com.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorReflector {
	private Constructor aConstructor;
	private Class[] parameters;
	private Object[] parameterValues;
	private Modifier aModifier; 
	private Class myOwnerClass; 

	
	public Class[] getParameters(){
		return this.parameters;		  
	}
	public Modifier getModifier() {
		return aModifier;
	}
	
	public Object[] getParameterValues() {
		return parameterValues;
	}
	public void setParameterValues(Object[] parameterValues) {
		this.parameterValues = parameterValues;
	}
	
	public Constructor getConstructor() {
		return aConstructor;
	}
	public void setConstructor(Constructor aMethod) {
		this.aConstructor = aMethod;
	}
	
	public ConstructorReflector(Class aClass){
		this.myOwnerClass = aClass;
	}
	public ConstructorReflector(){
		
	}
	public ConstructorReflector(Constructor constructor){
		this.aConstructor=constructor;
	}
}
