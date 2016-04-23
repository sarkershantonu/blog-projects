package org.practice.Annotations;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;
public class InfoAptProcessor extends AbstractProcessor{
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		//TODO -> Need to implement 
		return false;
	}
}
