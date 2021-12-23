package com.generic.tutorial;

// Generics Class
public class GenericsType<T> {

	private T t;
	
	public GenericsType(T t) {
		this.t = t;
	}
	
	// Generics Method
	public T get() {
		return t;
	}
}
