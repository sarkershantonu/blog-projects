package org.practice.Annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { PACKAGE, TYPE, METHOD, FIELD, PARAMETER, LOCAL_VARIABLE, CONSTRUCTOR, ANNOTATION_TYPE })
public @interface Info {
	enum Importancy {HIGH,MEDIUM,LOW,CRITICAL}
	Importancy[] priority();
	String[] values() default { "Default Value 1", "Default2" };
}
