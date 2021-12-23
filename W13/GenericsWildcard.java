package com.generic.tutorial;

import java.util.ArrayList;

public class GenericsWildcard {
	
	public static void printCollection(ArrayList<?> c) {
		int i = 1;
		for(Object o : c) {
			System.out.println(i + ". " + o);
			i++;
		}
	}
}
