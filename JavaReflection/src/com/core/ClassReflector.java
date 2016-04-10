package com.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Get all class Information in string format 
 * @author Shantonu
 *
 */
public class ClassReflector extends BasicItemsComponents{
	private MethodReflector aMethodReflector = null;
	private FieldReflector aFieldReflector = null;
	private ConstructorReflector aConstructorReflector = null;
	private EnumReflector aEnumReflector = null;
	
	private Class myClass;
	public Class GetClass(){return myClass;	}
	
	public ClassReflector(Class aClass){
		this();
		myClass = aClass;
	}
	ClassReflector(){
		aEnumReflector = new EnumReflector();
		aMethodReflector = new MethodReflector();
		aFieldReflector = new FieldReflector();
		aConstructorReflector = new ConstructorReflector();		
	}
	
	public String getPackageName(){
		return "Package Name : "+myClass.getPackage().getName()+", Version :"+myClass.getPackage().getSpecificationVersion() ;
	}
	public String getProtectionDomainName() {
		return "Protection Domain : "+myClass.getProtectionDomain().toString();
	}
	public String[] getAllSignerNames(){
		String[] names=null;
		int x=0;
		for(Object a: myClass.getSigners())
		{
			names[x]=a.toString();
			x++;
		}
		return names;	
	}
	public String getModifierName() {
		return "Modfier : "+Modifier.toString(myClass.getModifiers());
	}
	public String getClassName(){
		return "Class Name = "+myClass.getSimpleName()+" : Full Name "+myClass.getName();
	}
	public String getParentClassName(){
		return this.myClass.getSuperclass().getName();
	}
	public String[] getAllInterfaceNames(){
		String[] interfaces = null;
		int x=0;
		for(Class aClass: this.myClass.getInterfaces())
		{
			interfaces[x]=new String(aClass.getSimpleName());
			x++;
		}
		return interfaces;
	}
	//Method Section
	public String[] getALlMethodFullNames(){
		ArrayList<String> allMethods = new ArrayList<String>();
		Collections.addAll(allMethods, getAllPrivateMethodNames());
		Collections.addAll(allMethods, getAllProtectedMethodNames());
		Collections.addAll(allMethods, getAllPubliMethodNames());
		Collections.addAll(allMethods, getAllDefaultMethodNames());
		String[] methodNames = allMethods.toArray(new String[allMethods.size()]);//convert to arrray
		return methodNames;
		
	}
	private String[] getAllPrivateMethodNames(){
		return null;
	}
	private String[] getAllProtectedMethodNames(){
		return null;
	}
	private String[] getAllDefaultMethodNames(){
		return null;
	}
	private String[] getAllPubliMethodNames(){
		String[] names= null;
		int x=0;
		for(Method aMethod : myClass.getMethods()){
			//getting all public methods including inherited & implemented
			names[x] ="Method Name : "+aMethod.getName()+" , Full Name : "+aMethod.toString();
			x++;
		}
		return names;
	}
	public String[] getAllFieldFullNames(){
		ArrayList<String> allFields = new ArrayList<String>();
		Collections.addAll(allFields, getAllPrivateMethodNames());
		Collections.addAll(allFields, getAllProtectedMethodNames());
		Collections.addAll(allFields, getAllPubliMethodNames());
		Collections.addAll(allFields, getAllDefaultMethodNames());
		String[] fieldNames = allFields.toArray(new String[allFields.size()]);//convert to arrray
		return fieldNames;
		
	}
	private String[] getAllPublicFieldFullNames(){
		String[] names= null;
		int x=0;
		for(Field aField:myClass.getFields()){
			names[x] ="Field Name : "+aField.getName()+" , Full Name : "+aField.toString();
			x++;
		}
		return names;
	}
	private String[] getAllProtectedFieldFullNames(){
		return null;
	}
	private String[] getAllDefaultFieldFullNames(){
		return null;
	}
	private String[] getAllPrivateFieldFullNames(){
		return null;
	}
	
	public String[] getAllConstructorInfo(){
		ArrayList<String> allConstructors = new ArrayList<String>();
		Collections.addAll(allConstructors, getAllPublicConstructorInfo());
		Collections.addAll(allConstructors, getAllDefaultConstructorInfo());
		Collections.addAll(allConstructors, getAllPrivateConstructorInfo());
		Collections.addAll(allConstructors, getAllProtectedConstructorInfo());
		String[] sonstructorsNames = allConstructors.toArray(new String[allConstructors.size()]);//convert to arrray
		return sonstructorsNames;
	}
	private String[] getAllPublicConstructorInfo(){
		String[] names= null;
		int x=0;
		for(Constructor aConstructor: myClass.getConstructors()){
			names[x] ="Constructor Full Name : "+aConstructor.toString();
			x++;
		}
		return names;
	}
	private String[] getAllDefaultConstructorInfo(){
		return null; 
	}
	private String[] getAllPrivateConstructorInfo(){
		return null; 
	}
	private String[] getAllProtectedConstructorInfo(){
		return null; 
	}
	
	public void invokeAllMethods(){
		
	}
	public void invokeAMethod(String name){
		
	}
	public void invokeAMethod(String name, Object[] parameters){
		
	}
	public void invokeConstructor(){
		
	}
	public void invokeConstructor(Object[] parameters){
		
	}
	public Object getValueOf(Field aField){
		Object aValue; 
		return null;
	}

}

