package com.generic.tutorial;

public class GenericsBounded<T> {

private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T : " + t.getClass().getName());
		System.out.println("U : " + u.getClass().getName());
	}
	
	public static void main(String args[]) {
		GenericsBounded<Integer> objInteger = new GenericsBounded<Integer>();
		objInteger.set(16);
		objInteger.inspect(10);
	}
}
