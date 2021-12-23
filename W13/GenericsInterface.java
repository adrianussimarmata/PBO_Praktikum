package com.generic.tutorial;

interface MinMax<T extends Comparable<T>> {
	 T min();
	}

public class GenericsInterface<T extends Comparable<T>> implements MinMax<T>{

	T[] values;
	
	GenericsInterface(T[] obj) {
		this.values = obj;
	}
	
	public T max() {
		T v = values[0];
		for(int i=1; i<values.length; i++) {
			if(values[i].compareTo(v) > 0) {
				v = values[i];
			}
		}
		return v;
	}
	
	public T min() {
	     T o1 = values[0];
	     
	     for (int i = 1; i < values.length; i++) {
	         if (values[i].compareTo(o1) < 0) {
	             o1 = values[i];
	         }
	     }
	     return o1;
	 }	
}
