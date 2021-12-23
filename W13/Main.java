package com.generic.tutorial;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		
		// Asumsi : umur teman sesuai dengan urutan pada list nama
		Integer umurTeman[] = {12, 10, 14, 16, 13, 17};
		ArrayList<String> namaTeman = new ArrayList<String>();
		
		GenericsType<String> nama = new GenericsType<String>("Tono");
		GenericsType<Integer> umur = new GenericsType<Integer>(15);
		GenericsInterface<Integer> objekUmur = new GenericsInterface<Integer>(umurTeman);
		namaTeman.add("Andi");
		namaTeman.add("Budi");
		namaTeman.add("Supri");
		namaTeman.add("Rehan");
		namaTeman.add("Adit");
		namaTeman.add("Samsul");
		
		// Output
		System.out.println("Nama : " + nama.get());
		System.out.println("Umur : " + umur.get());
		System.out.println("Daftar teman " + nama.get() + ":");
		GenericsWildcard.printCollection(namaTeman);
		System.out.println("Umur teman " + nama.get() + " yang paling tua : " + objekUmur.max());
		System.out.println("Umur teman " + nama.get() + " yang paling muda : " + objekUmur.min());
	}
}
