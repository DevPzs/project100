package com.infra.reflection;

import java.lang.reflect.Method;

import com.infra.annotations.Init;

public class ObjectCreator {

	public static <T> T create(Class<T> classe) throws Exception {
		
		T object = classe.getConstructor().newInstance();
		
		for (Method method : classe.getDeclaredMethods()) {
			Init annotation = method.getAnnotation(Init.class);
			if (annotation != null && annotation.runOninstantiation() == true) {
				method.invoke(object);
			}
		}
		return object;
	}

}
