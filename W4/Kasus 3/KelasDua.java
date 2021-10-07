package com.latihan;

class KelasDua {

	// Initialization block
	// Men-set nilai default
	{
		System.out.println(5);
	}
	
	public static void main(String[] args) {
		System.out.println(6);
		KelasSatu satu = new KelasSatu();
		KelasSatu dua = new KelasSatu(10);
	}
}

class KelasSatu {
	
	// Initialization block
	// Men-set nilai default
	// selalu dieksekusi setiap kali sebuah instance dibuat dan dieksekusi sebelum constructor
	{
		System.out.println(11);
	}
	
	// static initialization block
	// akan dieksekusi sebelum main method dan initialization block
	static {
		System.out.println(2);
	}
	
	public KelasSatu(int i) {
		System.out.println(3);
	}
	
	public KelasSatu() {
		System.out.println(4);
	}
}
