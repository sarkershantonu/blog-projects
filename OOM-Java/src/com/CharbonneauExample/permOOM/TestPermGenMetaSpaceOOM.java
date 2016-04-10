package com.CharbonneauExample.permOOM;

import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

import com.javaOOM.TestOOM;

public class TestPermGenMetaSpaceOOM {
	
	private static Map<String, MyInterface> myMap = new HashMap<String, MyInterface>();
	private final static int iterationDefault =50000;
	public static void main(String[] args) {
		System.out.println("Class metadata leak simulator, example from Pierre-Hugues Charbonneau's blog");
		int iterations; 
		iterations = (args!=null&& args.length==1) ? Integer.parseInt(args[0]): iterationDefault; 
		/*this is checking arguments use following if you dont understand ?: operator, use this 		
		if(args!=null&& args.length==1)
		{
			iterations = Integer.parseInt(args[0]); 
		}else
		{
			iterations = iterationDefault;
		}*/
		try{
		for(int i=0; i<iterations;i++){
			String classLoaderJAR = "file:" +i+".jar";
			URL[] urlsOfJar = new URL[] {new URL(classLoaderJAR)};//an array containing jar url
			
			URLClassLoader aUrlClassLoader = new URLClassLoader(urlsOfJar); //a class loader to load all JAR urls
			
			//this will create new proxy to load the class loader
			MyInterface proxyObj = (MyInterface) Proxy.newProxyInstance(aUrlClassLoader, //adding class loader
					new Class<?>[]{MyInterface.class},//Anonymous class/Interface array which implements myInterface
					new MyInterfaceInvocationHandler(new MyClass())// an invocation handler(implements InvocationHandler)
					);			
			myMap.put(classLoaderJAR, proxyObj); // this will store all loaders which eventually leak memory as it is stored. 
		}
		}catch(Throwable anyError){
			anyError.printStackTrace();
			System.out.println("Error = " + anyError);
		}
		System.out.println("Completed = "); 
	}
	public static void createPermGenOOM(){
		int iterations=0; 	
		System.out.println("Class metadata leak simulator, example from Pierre-Hugues Charbonneau's blog");
		try{
			while(true){		
			String classLoaderJAR = "file:" +iterations+".jar";
			URL[] urlsOfJar = new URL[] {new URL(classLoaderJAR)};//an array containing jar url			
			URLClassLoader aUrlClassLoader = new URLClassLoader(urlsOfJar); //a class loader to load all JAR urls			
			//this will create new proxy to load the class loader
			MyInterface proxyObj = (MyInterface) Proxy.newProxyInstance(aUrlClassLoader, //adding class loader
					new Class<?>[]{MyInterface.class},//Anonymous class/Interface array which implements myInterface
					new MyInterfaceInvocationHandler(new MyClass())// an invocation handler(implements InvocationHandler)
					);			
			myMap.put(classLoaderJAR, proxyObj); // this will store all loaders which eventually leak memory as it is stored.
			TestOOM.showMemoryInfo();
			iterations++; 
		}
		}catch(Throwable anyError){
			anyError.printStackTrace();
			System.out.println("Error = " + anyError);				
		}
	}
}
