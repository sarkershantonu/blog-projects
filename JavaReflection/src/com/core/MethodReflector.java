package com.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodReflector extends BasicItemsComponents{

	private Method aMethod;
	private Class[] parameters;
	private Object[] parameterValues;
	
	private Class returnType;
	
	public Class getReturnType() {
		return returnType;
	}
		
	
	public Object[] getParameterValues() {
		return parameterValues;
	}
		
	public Method getMethod() {
		return aMethod;
	}
		
	public MethodReflector(){
		
	}
	public MethodReflector(Method method){
		this.aMethod=method;
	}
	
	//Reflection starts here 
	public String getModifierName(){
		return Modifier.toString(this.aMethod.getModifiers());
	}
	public String[] getParameterTypes(){
		String[] parameter = null;
		int x=0;
		for(Class aClass: this.aMethod.getParameterTypes())
		{
			parameter[x]=new String(aClass.getSimpleName());
			x++;
		}
		return parameter;
	}
	
	public boolean isGetter() {
		return true; 
	}
	public boolean isSetter() {
		return true; 
	}
	public void setAccessable(){
		this.aMethod.setAccessible(true);
	}
	@SuppressWarnings("null")
	public String[] getAnnotations(){
		String[] annotations = null ;
		int  x=0;
		for(Annotation annotation: aMethod.getAnnotations()){
			annotations[x]=new String(annotation.toString());
			x++;
		}
		return annotations;
	}
	
	public Object runMethod() {
		return null;
		
	}
	
	
}
