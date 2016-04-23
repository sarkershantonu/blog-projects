package org.practice.Annotations;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InfoProcessor {
	public static void main(String... args) throws ClassNotFoundException, IOException {
		new InfoProcessor().processAnnotation();
		}

	public void processAnnotation() throws ClassNotFoundException, IOException {
		Class[] all = InfoProcessHelper.getAllClasses(this.getClass().getPackage().getName());
		for (Class aClass : all) {
			// System.out.println(aClass.getName());
			if (aClass.isAnnotationPresent(Info.class)) {
				Annotation annotation = aClass.getAnnotation(Info.class);
				Info info = (Info) annotation;
				System.out.println("\nThis is a Class , Name ->" + aClass.getName());
				printAllInfo(info);
			}
			int k = 0;
			for (Constructor constructor : aClass.getConstructors()) {
				if (constructor.isAnnotationPresent(Info.class)) {
					Annotation constractorAnnotation = constructor.getDeclaredAnnotation(Info.class);
					System.out.println("\nConstructor : " + k++ + ", Name ->" + constructor.getName());
					printAllInfo((Info) constractorAnnotation);
				}
			}

			int i = 0;
			for (Field f : aClass.getDeclaredFields()) {
				if (f.isAnnotationPresent(Info.class)) {
					Annotation methodAnnotaitons = f.getAnnotation(Info.class);
					System.out.println("\nField : " + i++ + ", Name ->" + f.getName());
					printAllInfo((Info) methodAnnotaitons);
				}
			}
			int j = 0;
			for (Method aMethod : aClass.getDeclaredMethods()) {
				if (aMethod.isAnnotationPresent(Info.class)) {
					Annotation methodAnnotaitons = aMethod.getAnnotation(Info.class);
					System.out.println("\nMethod : " + j++ + ", Name ->" + aMethod.getName());
					printAllInfo((Info) methodAnnotaitons);
				}
			}
		}
	}

	private void printAllInfo(Info info) {
		for (Info.Importancy property : info.priority()) {
			System.out.println("Importancy:" + property.toString());
		}
		int i = 0;
		for (String aValue : info.values()) {
			System.out.println("Value:" + i++ + " : " + aValue);
		}
	}

}