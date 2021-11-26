package com.Soal3;

public class Main {

//	/* Operasi Pembagian */
//	public static void main(String args[]) {
//		
//		// Tidak menggunakan Exception Handling
////		int a = 5;
////		int b = 0;
////		int c = a/b;
////		System.out.println("hasil : " + c);
//		
//		// Menggunakan Exception Handling
//		try {
//			int a = 5;
//			int b = 0;
//			int c = a/b;
//			System.out.println("hasil : " + c);
//		}
//		catch(ArithmeticException ex) {
//			System.err.println(ex);
//		}
//		System.out.println("Program selesai");
//	}
	
	/* Operasi yang melibatkan Array */
//	public static void main(String args[]) {
//		
//		int arr[] = {1,2,3,4,5};
//		
//		// Tidak menggunakan Exception Handling
////		System.out.println("Array index ke 5 : " + arr[5]);
//		
//		// Menggunakan Exception Handling
//		try {
//			System.out.println("Array index ke 5 : " + arr[5]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.err.println(e);
//		}
//		System.out.println("Program selesai");
//	}
	
	/* Pada operasi TextField yang hanya boleh integer */
//	public static void main(String args[]) {
//		
//		Scanner input = new Scanner(System.in);
//		
//		//  Tidak menggunakan Exception Handling
////		int angka = input.nextInt();
////		System.out.println("Nilai inputan : " + angka);
//		
//		// Menggunakan Exception Handling
//		try {
//			int angka = input.nextInt();
//			System.out.println("Nilai inputan : " + angka);
//		}
//		catch(InputMismatchException e) {
//			System.err.println(e);
//		}
//		System.out.println("Program selesai");
//	}
	
	/* Pada operasi file */
//	public static void main(String args[]) {
//		
//		// Tidak menggunakan Exception Handling
////		FileReader myFile = new FileReader("somefile.txt");
//		
//		// Menggunakan Exception Handling
//		try {
//			FileReader myFile = new FileReader("somefile.txt");
//		}
//		catch(FileNotFoundException e) {
//			System.err.println(e);
//		}
//		System.out.println("Program selesai");
//	}
	
	// Jika menggunakan variable reference yang belum diinisiasi
	public static void main(String args[]) {
		
		String nama;
		
		// Tidak menggunakan Exception Handling
//		System.out.println("Nama : " + nama);
		
		// Menggunakan Exception Handling
		try {
			System.out.println("Nama : " + nama);
		}
		catch(Exception e) {
			System.err.println(e);
		}
		System.out.println("Program selesai");
	}
}
