package com.core;

import java.lang.reflect.Modifier;

public abstract class BasicItemsComponents {
	protected Modifier aModifier; 
	public Modifier getModifier() {
		return aModifier;
	}
	public abstract String getModifierName();
	
}
